package Project;

public interface ILibrarian {
    void createAccount(int pnummer, String fnamne, String lname, String role);


   boolean checkBanned(Member member);

    void suspendMember(Member member);

    void deleteMember();

    boolean borrowBook(String title, int id);

    void returnBook();

    void checkDeletedMember();

    void isItemAvailable();

    boolean doesItemExist(String title);
}
