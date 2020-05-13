package Project;

public interface ILibraryStore {
    BannedMembers[] getAllBannedMembers();

    Member[] getPersonalNumber(int pNummer);

    Member[] checkBanned(boolean isBanned);

    Member[] getAllMembers(String firstName, String lastName, String rank, int personalNum);

    Member[] addMember(String firstName, String lastName, int personalNum);


    Book[] getAllBooks();

}
