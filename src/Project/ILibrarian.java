package Project;

public interface ILibrarian {
    void createAccount(int pnummer, String fnamne, String lname, String role);


   boolean checkBanned(Member member);

    void suspendMember(Member member);

    void deleteMember(int id);

    void borrowBook(String title, int id, String role);

    void returnBook();

    void checkDeletedMember();

    boolean isItemAvailable(String title);

    boolean doesItemExist(String title);
}
