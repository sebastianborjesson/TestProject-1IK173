package Project;

import java.util.Iterator;
import java.util.function.Consumer;

public class Librarian implements ILibrarian {

    private LibraryStore ls;
    private LibraryStub lst;

    public Librarian(LibraryStore ls) {
        this.ls = ls;
    }

    public Librarian() {
    }

    public void LibraryStubArray(LibraryStub lst) {
        this.lst = lst;
    }

    Member[] memberList = new Member[10];

    @Override
    
    public void createAccount(LibraryStub lbs, String fnamn, String lnamn, String rank, int pnummer) {

        if (lbs.members.isEmpty()) {
            lbs.addMember(fnamn, lnamn, rank, pnummer);
        }
        Iterator<Member> it = lbs.members.iterator();
        while (it.hasNext()) {
            Member m = it.next();

            if (m.getPersonalNum() == pnummer) {
                System.out.println("User already exists.");
            } else if (m.getPersonalNum() == pnummer && m.isBanned()) {
                System.out.println("This member is banned and can't be registred");
            } else {
                lbs.addMember(fnamn, lnamn, rank, pnummer);
            }

        }
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
    public void borrowBook() {

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
    public void doesItemExist() {

    }
}