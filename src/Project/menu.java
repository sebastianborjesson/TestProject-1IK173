package Project;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Member nyMedlem = new Member(1, 19950409, "Aljosa", "Vuckovic", "Student", new int[]{0, 0, 0}, false, 0);
        Book nyBok = new Book("Game Of Thrones", "George R.R. Martin", )

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

                Member newMember = new Member();
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
