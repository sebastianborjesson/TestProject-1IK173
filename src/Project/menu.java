package Project;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Librarysystem \n=============");
            System.out.println("1. Create user");
            System.out.println("2. Rent book");
            System.out.println("3. Return book");
            System.out.println("5. Close the system");
            System.out.print("Make your choice: -> ");
            choice = scan.nextInt();

            if (choice == 1) {
                int personalnumber = 0;
                String firstName;
                String lastName;

                System.out.println("Personal number: ");
                personalnumber = scan.nextInt();

                System.out.println("First name: ");
                firstName = scan.nextLine();

                System.out.println("Last name: ");
                lastName = scan.nextLine();

                Member newMember = new Member(personalnumber, firstName, lastName);
            }
            if (choice == 2) {
                System.out.println("Which book are you searching for? ");
            }
            if (choice == 3) {
                System.out.println("Enter your ");
            }
        }
        while (choice != 5);
        System.out.println("Good bye!");
    }
}
