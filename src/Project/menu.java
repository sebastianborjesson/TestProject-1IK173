package Project;

import java.util.Scanner;


public class menu{
    public static void main(String[] args) {
        Member nyMedlem = new Member(1, 19950409, "Aljosa", "Vuckovic", "Student", new int[]{0, 0, 0}, false, 0);

        LibraryStore ls = null;
        Librarian librarian = new Librarian();
        Member member = new Member();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the library! \n=============");
            System.out.println("In the menu below you will see the current options that the library has.");
            System.out.println("1. Create user");
            System.out.println("2. Rent book");
            System.out.println("3. Return book");
            System.out.println("5. Close the system");
            System.out.print("Make your choice: -> ");
            choice = scan.nextInt();

            if (choice == 1) {

                int personalnumber = 0;
                System.out.print("Personal number: ");

                String firstName;
                String lastName;
                String rank;
                int [] antalLan;
                boolean isBanned;
                int numOfBans;
                System.out.println("Personal number: ");

                personalnumber = scan.nextInt();

                scan.nextLine();
                System.out.print("First name: ");
                //String firstName = scan.nextLine();

                System.out.print("Last name: ");
                //String lastName = scan.nextLine();

                System.out.println("Your rank at the university: ");
                //String rank = scan.nextLine();

                //librarian.createAccount("Spuud", "Spuudgren", "Student", 915224);
                //librarian.createAccount(firstName, lastName, rank, personalnumber);
                //System.out.println(ls.getAllMembers(firstName, lastName, personalnumber))
                /*System.out.println("\nA new user has been created. The information for the user is, \n"
                        + "personalnumber: " + personalnumber
                        + " \nfirstname: " + firstName
                        + " \nlastname: " + lastName
                        + " \nrole " + role);*/
            }
            if (choice == 2) {
                System.out.println("Which book are you searching for? ");
                String bookTitle = scan.nextLine();

            }
            if (choice == 3) {
                System.out.println("Enter your userid");

            }
        }
        while (choice != 5);
        System.out.println("Good bye!");
    }
}
