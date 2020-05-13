package Project;

public interface ILibrarian {
    void createAccount(LibraryStub lbs, String fnamn, String lnamn, String rank, int pnummer);


   boolean checkBanned(Member member);

    void suspendMember(Member member);

    void deleteMember();

    boolean borrowBook(String title, int id);

    void returnBook();

    void checkDeletedMember();

    void isItemAvailable();

    boolean doesItemExist(String title);
}
