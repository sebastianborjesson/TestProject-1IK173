package Project;

import java.util.Arrays;
import java.util.Scanner;
import java.sql.*;

public class menu extends Librarian{
    public static void main(String[] args) {
        LibraryStore ls = new LibraryStore();
        Librarian lib = new Librarian(ls);
        Scanner scan = new Scanner(System.in);
        int choice;






        do {
            System.out.println("Welcome to the library! \n=============");
            System.out.println("In the menu below you will see the current options that the library has.");
            System.out.println("1. Register a new user to the library!");
            System.out.println("2. Rent book");
            System.out.println("3. Return book");
            System.out.println("4. Check members of database");     //Tillfällig för hjälp
            System.out.println("6. Remove existing user");
            System.out.println("7. Close the system");
            System.out.print("Make your choice: -> ");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("\nRegister a new user");
                System.out.print("Personal number: ");
                int personalnumber;
                personalnumber = scan.nextInt();

                System.out.print("First name: ");
                String firstName = scan.next();

                System.out.print("Last name: ");
                String lastName = scan.next();

                System.out.print("Your role at the university: ");
                String role = scan.next();

            }

            if (choice == 2) {
                System.out.println("If you like to rent a book, here is the current available books that the library offers: ");

                      //Hämta böcker
                Book[] books = ls.getAllBooks();
                for (Book b: books) {
                    System.out.println("Book title: " + b.getTitle() + " |----| Author of the book: " + b.getAuthor());
                }


                String bookTitle;
                System.out.print("Write the books title that you wish to loan:");
                bookTitle= scan.nextLine();

                bookTitle = scan.nextLine();
                if (lib.doesItemExist(bookTitle)){
                    System.out.println("Boken fanns");
                }else {System.out.println("Boken fanns inte");}


                System.out.print("Enter your identification code: ");
                int id = scan.nextInt();

                String role = scan.nextLine();






                //lib.isItemAvailable();


                    //Fortsättningsblock är arbeta på.
                if (lib.borrowBook(bookTitle, id, role)) {
                    System.out.println("Success! You have borrowed the book: " + bookTitle);
                }

            }
            if (choice == 3) {
                System.out.println("If you like to return a book, please enter your userid: ");
                int userId;
                userId = scan.nextInt();
            }
            if (choice == 4) {
                Member [] members = ls.getAllMembers();

                for (Member m: members) {
                    System.out.println(m.getFirstName());
                }
            }
            if (choice == 6) {
                System.out.print("Enter the id of the user that you wish to remove: ");
                int deleteId;
                deleteId = scan.nextInt();
                lib.deleteMember(deleteId);
            }
        }
        while (choice != 7);
        System.out.println("Good bye and welcome back!");
    }
}