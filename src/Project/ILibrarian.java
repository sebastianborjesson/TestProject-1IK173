package Project;

public interface ILibrarian {
    void createAccount(String fnamn, String lnamn, String rank, int pnummer);

    void checkBanned();

    void suspendMember();

    void deleteMember();

    void borrowBook();

    void returnBook();

    void checkDeletedMember();

    void isItemAvailable();

    void doesItemExist();
}
