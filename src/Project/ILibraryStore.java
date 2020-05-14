package Project;

public interface ILibraryStore {
    BannedMembers[] getAllBannedMembers();

    Member[] getPersonalNumber(int pNummer);

    Member[] checkBanned(boolean isBanned);

    Member[] getAllMembers();

    void borrowBook(int ID, String title, int numOfLoans);

    void addMember(int ID,int personalNum, String firstName, String lastName, String role );

    void removeMember(int id);

    Book[] getAllBooks();

}
