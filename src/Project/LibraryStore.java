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
    public Member[] getPersonalNumber(int pNummer) {
        Member[] p = new Member[0];
        return p;
    }

    @Override
    public Member[] checkBanned(boolean isBanned) {
        Member[] iB = new Member[0];
        return iB;
    }

    @Override
    public Member[] getAllMembers(String firstName, String lastName, String rank, int personalNum) {
        Member[] m = new Member[0];
        return m;
    }


    @Override
    public Book[] getAllBooks(String Title){
        Book[] x = new Book[0];

        return x;
    }
}
