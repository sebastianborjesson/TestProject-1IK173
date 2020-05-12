package Project;

public class Librarian implements ILibrarian {

    private LibraryStore ls;
    private LibraryStub lst;

    public Librarian(LibraryStore ls){
        this.ls = ls;
    }

    public void LibraryStubArray (LibraryStub lst) {
        this.lst = lst;
    }

    @Override
    public void createAccount(String fnamn, String lnamn, String rank, int pnummer) {
        Member[] createAccount = ls.getAllMembers(fnamn, lnamn, pnummer);
        for (Member m: createAccount) {
            if (m.getPersonalNum() == pnummer) {
                System.out.println("User already exists.");
            } else if (m.getPersonalNum() == pnummer && m.isBanned()) {
                System.out.println("This member is banned and can't be registred");
            } else {
                lst.addMember(fnamn, lnamn, pnummer);
            }

        }

    }

    @Override
    public void checkBanned() {

    }

    @Override
    public void suspendMember() {

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
