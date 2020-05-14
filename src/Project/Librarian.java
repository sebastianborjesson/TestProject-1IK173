package Project;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;


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

        for(BannedMembers bm: bannedMembers) {
            if (bm.getPersonalNum() == pnummer) {
                System.out.println("This account is banned. Dont come back");
            }
        }


        for (Member m  : member ) {
            if(m.getPersonalNum() == pnummer && m.isSuspended()  ){
                System.out.println("This person is suspended from entering the system! The process will not be allowed to continue.");
                counter--;
            } else if (m.getPersonalNum() == pnummer){
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

        for (BannedMembers bm: bannedMembers) {
            if (bm.getPersonalNum() == id)  {
                libraryStore.removeMember(id);
            }
        }
        for (Member m: members) {
            if (m.getID() != id)  {
                System.out.println("Didnt find the user");
            }
            else {
                libraryStore.removeMember(id);
                System.out.println("The user has been removed from the system " + "where the id was: " + id);
            }
        }
    }

    @Override
    public void borrowBook(String title, int id, String role) {

        Member[] members = libraryStore.getAllMembers();
        Book[] books = libraryStore.getAllBooks();

        for (Book b: books) {
            String isbn = b.getIsbn();
            if (b.getIsbn().equals(isbn));
        }

        for (Member m : members) {
            int numOfLoans = m.getNumOfLoans() ;
            if (m.getID() == id && !m.isSuspended()) {
                if(m.getRole().equals("Student")) {
                    if (m.getNumOfLoans() < 3) {
                        numOfLoans++;
                        m.setNumOfLoans(numOfLoans);
                        libraryStore.borrowBook(id, title, numOfLoans);
                    }
                }
            }



        }
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void checkDeletedMember() {
            //Förmodligen kan vi ta bort
    }

    @Override
    public boolean isItemAvailable(String title) {
        Book[] books = libraryStore.getAllBooks();
        for (Book book: books) {

            if (title.equals(book.getTitle())) {
                return true;

            }
        }return false;

    }

    @Override
    public boolean doesItemExist(String title) {

        Book[] books = libraryStore.getAllBooks();
        for (Book book: books) {

            if (title.equals(book.getTitle())) {
                return true;

            }
        }return false;
    }
}

