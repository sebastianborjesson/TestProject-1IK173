package Project;

import java.sql.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;



public class LibraryStore implements ILibraryStore {

        ArrayList<Member> memberArrayList = new ArrayList<>();
        ArrayList<Book> arrayListBooks = new ArrayList<>();
        ArrayList<BannedMembers> bannedMembersArrayList = new ArrayList<>();

    private static String url;
    private static String username;
    private static String password;

    private static void init(String filename) {
        Properties props = new Properties();
        try(FileInputStream in = new FileInputStream(filename)) {
            props.load(in);
            String driver = props.getProperty("jdbc.driver");
            url = props.getProperty("jdbc.url");
            username = props.getProperty("jdbc.username");
            if(username == null){
                username = "";
            }
            password = props.getProperty("jdbc.password");
            if(password == null){
                password = "";
            }
            if(driver!=null){
                Class.forName(driver);
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong... " + ex.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Unable to load driver." + cnfe.getMessage());
        }
    }


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public BannedMembers[] getAllBannedMembers() {
        bannedMembersArrayList.clear();
        init("database.properties");
        try(Connection conn = getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM project1ik173.bannedmembers");
            while (result.next()) {
                BannedMembers BM = new BannedMembers(result.getInt("pNummer") , result.getInt("ID"));
                bannedMembersArrayList.add(BM);
            }
        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }

        BannedMembers[] bannedMembers = new BannedMembers[bannedMembersArrayList.size()];
        return bannedMembersArrayList.toArray(bannedMembers);
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
    public Member[] addMember(String firstName, String lastName, int personalNum){
        Member[] m = new Member[0];
        return m;

    }

    @Override
    public Book[] getAllBooks(){
        arrayListBooks.clear();
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver did not load");
        }*/

        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/1ik173project?useSSL=false",
                "root", "juzzkehunter124")) {

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT book.title, book.author from book");

            while(result.next()) {
                Book book = new Book(result.getString(1), result.getString(2));
                arrayListBooks.add(book);
                //System.out.println("Book: " + result.getString(1) + " | Author: " + result.getString(2));
            }
            statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Something went wrong...");
        }

        Book[] books = new Book[arrayListBooks.size()];
        return arrayListBooks.toArray(books);
    }
}
