package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        Scanner scan = new Scanner(System.in);
        AddressBook book = new AddressBook();
        int flag = 1;

        while (flag == 1) {
            System.out.println("Select a choice : \n1. ADD CONTACT \n2. EDIT CONTACT \n3. DISPLAY CONTACT \n4. DELETE CONTACT \n5. EXIT ");
            System.out.println("Enter the Operation Number: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    if (book.contactPersonArrayList.isEmpty()) {
                        System.out.println(" Address book is empty ");
                        break;
                    }
                    book.editContact();
                    break;
                case 3:
                    book.showContact();
                    break;
                case 4:
                    if (book.contactPersonArrayList.isEmpty()) {
                        System.out.println(" Address book is empty ");
                        break;
                    }
                    book.deleteContact();
                    break;
                case 5:
                    flag = 0;
                    System.out.println("Exited Successfully");
                    break;
                default:
                    System.out.println("Enter a valid Operation Number: ");
                    break;
            }

        }
    }
}
