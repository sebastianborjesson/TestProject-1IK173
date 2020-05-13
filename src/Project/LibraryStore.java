package Project;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;



public class LibraryStore implements ILibraryStore {


        private List<BannedMembers> bm1;
        private List<Member> mem;

        public LibraryStore(){
            bm1 = new ArrayList<BannedMembers>();
            mem = new ArrayList<Member>();
        }

        ArrayList<Member> memberArrayList = new ArrayList<>();
        ArrayList<Book> arrayListBooks = new ArrayList<>();
        ArrayList<BannedMembers> bannedMembersArrayList = new ArrayList<>();

    private static String url;
    private static String username;
    private static String password;

    /*
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

     */

    @Override
    public BannedMembers[] getAllBannedMembers() {
        bannedMembersArrayList.clear();

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/1ik173project?useSSL=false",

                "root", "abc123")) {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT pNumber , ID FROM 1ik173project.bannedmembers");
            while (result.next()) {
                BannedMembers BM = new BannedMembers(result.getInt("pNumber") , result.getInt("ID"));
                bm1.add(BM);
            }

            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }

        BannedMembers[] bannedMembers = new BannedMembers[bm1.size()];
        return bm1.toArray(bannedMembers);
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
    public Member[] getAllMembers() {


        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/1ik173project?useSSL=false",

                "root", "abc123")) {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from member");
            while (result.next()) {
                Member m = new Member(result.getInt(1) , result.getInt(2), result.getString(3),result.getString(4), result.getString(5), result.getInt(6), result.getBoolean(7), result.getInt(8) );
                memberArrayList.add(m);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }

        Member[] members = new Member[memberArrayList.size()];
        return memberArrayList.toArray(members);

    }

    @Override
    public void addMember(int ID,int personalNum, String firstName, String lastName, String role ){
        int numbOfLoans = 0;
        boolean isBanned = false;
        int numbOfBan = 0;


        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/1ik173project?useSSL=false",

                "root", "abc123")) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO member value (?,?,?,?,?,?,?,?)");
            ps.setInt(1, ID);
            ps.setInt(2, personalNum);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setString(5, role);
            ps.setInt(6,numbOfLoans);
            ps.setBoolean(7, isBanned);
            ps.setInt(8, numbOfBan);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }
    }

    @Override
    public Book[] getAllBooks(){
        arrayListBooks.clear();     //Clear array before select, else duplicates.

        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/1ik173project?useSSL=false",

                "root", "abc123")) {


            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT book.title, book.author from book");

            while(result.next()) {

                Book book = new Book(result.getString(1), result.getString(2));
                arrayListBooks.add(book);
                //System.out.println("Book: " + result.getString(1) + " | Author: " + result.getString(2));

            }
            //statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Something went wrong...");
        }
        Book[] books = new Book[arrayListBooks.size()];
        return arrayListBooks.toArray(books);
    }
}
