package Project;

import java.util.Arrays;
import java.util.Scanner;
import java.sql.*;

public class menu{
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

                //Book[] availablebooks = ls.getAllBooks();       //Hämta böcker
                ls.getAllBooks();


                System.out.print("Enter your identification code: ");
                int identificationcode;
                identificationcode = scan.nextInt();

                System.out.print("Write the books title that you wish to loan: ");
                String bookTitle = scan.next();
                lib.doesItemExist(bookTitle);

                lib.isItemAvailable();



            }
            if (choice == 3) {
                System.out.println("If you like to return a book, please enter your userid: ");
                int userId;
                userId = scan.nextInt();
            }
        }
        while (choice != 7);
        System.out.println("Good bye and welcome back!");
    }
}