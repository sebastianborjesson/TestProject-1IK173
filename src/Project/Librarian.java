package Project;

import java.util.Random;


public class Librarian implements ILibrarian {

    private LibraryStore libraryStore;
    private LibraryStub lst;

    public Librarian(LibraryStore ls) {
        libraryStore = ls;
    }

    public Librarian() {
    }

    public void LibraryStubArray(LibraryStub lst) {
        this.lst = lst;
    }

    Member[] memberList = new Member[10];

    @Override

    public void createAccount(int pnummer, String fnamn, String lnamn, String role) {

        Member[] member = libraryStore.getAllMembers();
        BannedMembers[] bannedMembers = libraryStore.getAllBannedMembers();
        Random rnd = new Random();
        int id = rnd.nextInt(9999 - 1000) + 1000;
        int counter = member.length;

        for (BannedMembers bm : bannedMembers) {
            if (bm.getPersonalNum() == pnummer) {
                System.out.println("This account is banned. Dont come back");
            }
        }


        for (Member m : member) {
            if (m.getPersonalNum() == pnummer && m.isSuspended()) {
                System.out.println("This person is suspended from entering the system! The process will not be allowed to continue.");
                counter--;
            } else if (m.getPersonalNum() == pnummer) {
                System.out.println("This person already exist in the system");
                counter--;
            } else {
                counter--;
            }
            if (counter == 0) {
                libraryStore.addMember(id, pnummer, fnamn, lnamn, role);
            }

        }


 /*       if (lbs.member.isEmpty()) {
>>>>>>> Stashed changes
            lbs.addMember(fnamn, lnamn, rank, pnummer);
        }
        Iterator<Member> it = lbs.member.iterator();
        while (it.hasNext()) {
            Member m = it.next();

            if (m.getPersonalNum() == pnummer) {
                System.out.println("User already exists.");
            }
            if (m.getPersonalNum() == pnummer && m.isBanned()) {
                System.out.println("This member is banned and can't be registred");
            }
            else {
               // lbs.addMember(fnamn, lnamn, rank, pnummer);
            }
            break;

        }

  */

    }


    @Override
    public boolean checkBanned(Member member) {
       /* for (Member m :createAccount) {
            if (m.isBanned()){
                return true;
            }
        } */
        return false;
    }

    public Member getMedlem() {
        /*for (Member m:createAccount) {
            return m;
        }*/
        return null;
    }


    @Override
    public void suspendMember(Member member) {
        return;
    }

    @Override
    public void deleteMember(int id) {
        Member[] members = libraryStore.getAllMembers();
        BannedMembers[] bannedMembers = libraryStore.getAllBannedMembers();

        for (BannedMembers bm : bannedMembers) {
            if (bm.getPersonalNum() == id) {
                libraryStore.removeMember(id);
            }
        }
        for (Member m : members) {
            if (m.getID() != id) {
                System.out.println("Didnt find the user");
            } else {
                libraryStore.removeMember(id);
                System.out.println("The user has been removed from the system " + "where the id was: " + id);
            }
        }
    }

    @Override
    public boolean borrowBook(String title, int id, String role) {

        Member[] members = libraryStore.getAllMembers();
        Book[] books = libraryStore.getAllBooks();
        String isbn;
        int numOfLoanedEx = 0;

        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                isbn = b.getIsbn();
                numOfLoanedEx = b.getNumberOfBorrowedEx();
                numOfLoanedEx++;
                b.setNumberOfBorrowedEx(numOfLoanedEx);
            }
        }
        for (Member m : members) {
            int numOfLoans = m.getNumOfLoans();

            if (m.getID() == id && !m.isSuspended()) {
                if (m.getRole().equalsIgnoreCase("Student")) {
                    if (numOfLoans < 3) {
                        numOfLoans++;
                        m.setNumOfLoans(numOfLoans);
                        libraryStore.borrow(id, title, numOfLoans, numOfLoanedEx);
                        return true;
                    } else {
                        System.out.println("You have exceded the number of loans!");
                    }
                } else if (m.getRole().equals("Postgraduate")) {
                    if (numOfLoans < 5) {
                        numOfLoans++;
                        m.setNumOfLoans(numOfLoans);
                        libraryStore.borrow(id, title, numOfLoans, numOfLoanedEx);
                        return true;
                    } else {
                        System.out.println("You have exceded the number of loans!");
                    }
                } else if (m.getRole().equals("PhD")) {
                    if (numOfLoans < 7) {
                        numOfLoans++;
                        m.setNumOfLoans(numOfLoans);
                        libraryStore.borrow(id, title, numOfLoans, numOfLoanedEx);
                        return true;
                    } else {
                        System.out.println("You have exceded the number of loans!");
                    }

                } else if (m.getRole().equals("Teacher")) {
                    if (numOfLoans < 10) {
                        numOfLoans++;
                        m.setNumOfLoans(numOfLoans);
                        libraryStore.borrow(id, title, numOfLoans, numOfLoanedEx);
                        return true;
                    } else {
                        System.out.println("You have exceded the number of loans!");
                    }
                    return false;


                }
            }
        }return false;
    }

    @Override
    public void returnBook(String title, String isbn, int ID) {

        String returnOfISBN="";
        int numOfLoans=0;
        int numOfBorrowedEx=0;
        HasBook [] hasBooks= libraryStore.getAllBorrowedBooks();
        Book [] books=libraryStore.getAllBooks();
        Member [] members=libraryStore.getAllMembers();

        for (HasBook hb:hasBooks) {
            if (hb.getTitle().equals(title) && hb.getID()==ID){
                returnOfISBN=hb.getISBN();
            }
        }
        for (Member m: members) {
            if (m.getID()==ID){
                numOfLoans=m.getNumOfLoans();
                numOfLoans--;
            }

        }
        for (Book b: books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.getIsbn().equalsIgnoreCase(isbn)){
                numOfBorrowedEx=b.getNumberOfBorrowedEx();
            }

        }
        libraryStore.returnB(title,ID,returnOfISBN,numOfLoans,numOfBorrowedEx);
    }

    @Override
    public void checkDeletedMember() {
        //Förmodligen kan vi ta bort
    }

    @Override
    public boolean isItemAvailable(String title) {
        Book[] books = libraryStore.getAllBooks();
        int nrOfEx=0;
        int nrOfBorrowedEx=0;
        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                nrOfEx=book.getNumberOfEx();
                nrOfBorrowedEx=book.getNumberOfBorrowedEx();
                if (nrOfBorrowedEx < nrOfEx) return true;
            }
        }
        return false;
    }

    @Override
    public boolean doesItemExist(String title) {

        Book[] books = libraryStore.getAllBooks();
        for (Book book : books) {

            if (title.equals(book.getTitle())) {
                return true;

            }
        }
        return false;
    }
}

