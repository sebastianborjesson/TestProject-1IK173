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
        Random rnd = new Random();
        int id = rnd.nextInt(9999 - 1000) + 1000;
        int counter = member.length;

        for (Member m  : member ) {
            if(m.getPersonalNum() == pnummer && m.isBanned()  ){
                System.out.println("This person is banned from entering the system! The process will not be allowed to continue.");
                counter--;
            } else if (m.getPersonalNum() == pnummer){
                System.out.println("This person already exist in the system");
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
    public void deleteMember() {

    }

    @Override
    public boolean borrowBook(String title, int id) {
        


        return false;
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void checkDeletedMember() {

    }

    @Override
    public void isItemAvailable() {


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

