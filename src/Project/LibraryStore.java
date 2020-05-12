package Project;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LibraryStore implements ILibraryStore {

    @Override
    public BannedMembers[] getAllBannedMembers(int personalNum) {
        BannedMembers[] bM = new BannedMembers[0];
        return bM;
    }

    @Override
    public Member[] getAllMembers(String firstName, String lastName, int personalNum) {
        Member[] m = new Member[0];
        return m;
    }


    @Override
    public Book[] getAllBooks(String Title){
        Book[] x = new Book[0];

        return x;
    }
}
