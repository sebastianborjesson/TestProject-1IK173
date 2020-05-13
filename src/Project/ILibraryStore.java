package Project;

public interface ILibraryStore {
    BannedMembers[] getAllBannedMembers();

    Member[] getPersonalNumber(int pNummer);

    Member[] checkBanned(boolean isBanned);

    Member[] getAllMembers();

    void addMember(int ID,int personalNum, String firstName, String lastName, String role );


    Book[] getAllBooks();

}
