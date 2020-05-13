package Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LibraryStore implements ILibraryStore {

    private ArrayList<Book> arrayListBooks = new ArrayList<>();

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
    public Member[] getAllMembers() {
        Member[] m = new Member[0];
        return m;
    }

    @Override
    public Member[] getMember(String firstName, String lastName, int personalNum){
        Member[] m = new Member[0];
        return m;

    }

    @Override
    public Book[] getAllBooks(){
        Book[] bookArray = new Book[12];

        /*try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver did not load");
        }*/

        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/1ik173project?useSSL=false",
                "root", "abc123")) {

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT book.title, book.author from book");

            while(result.next()) {
                System.out.println("Book: " + result.getString(1) + " | Author: " + result.getString(2));
            }
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Something went wrong...");
        }
        return bookArray;
    }
}
