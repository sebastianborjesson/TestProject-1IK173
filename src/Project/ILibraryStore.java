package Project;

public interface ILibraryStore {
    BannedMembers[] getAllBannedMembers(int personalNum);

    Member[] getAllMembers(String firstName, String lastName, int personalNum);

    Book[] getAllBooks(String Title);
}
