package Project;

public interface ILibraryStore {
    BannedMembers[] getAllBannedMembers(int personalNum);

    Member[] getPersonalNumber(int pNummer);

    Member[] checkBanned(boolean isBanned);

    Member[] getAllMembers(String firstName, String lastName, int personalNum);

    Book[] getAllBooks(String Title);
}
