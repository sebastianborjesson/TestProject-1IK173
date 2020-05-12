package Project;

public interface ILibrarian {
    void createAccount(LibraryStub lbs, String fnamn, String lnamn, String rank, int pnummer);


   boolean checkBanned(Member member);

    void suspendMember(Member member);

    void deleteMember();

    void borrowBook();

    void returnBook();

    void checkDeletedMember();

    void isItemAvailable();

    void doesItemExist();
}
