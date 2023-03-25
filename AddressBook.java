package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<ContactPerson> contactPersonArrayList = new ArrayList<ContactPerson>();

    public void addressBookOperationWork(ArrayList<ContactPerson> contactPersonArrayList) {
        AddressBook book = new AddressBook();
        int flag = 1;

        while (flag == 1) {
            System.out.println("Select a choice : \n1. ADD CONTACT \n2. EDIT CONTACT \n3. DISPLAY CONTACT \n4. DELETE CONTACT \n5. EXIT ");
            System.out.println("Enter the Operation Number: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    if (book.contactPersonArrayList.isEmpty()) {
                        System.out.println(" Address Book Is Empty: ");
                        break;
                    }
                    book.editContact();
                    break;
                case 3:
                    book.showContact();
                    break;
                case 4:
                    if (book.contactPersonArrayList.isEmpty()) {
                        System.out.println(" Address Book Is Empty: ");
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

    public void addContact() {
        ContactPerson contactPerson = new ContactPerson();
        if (duplicateCheck() == true) {
            System.out.println("This Contact Is Already Exist: ");
        } else {
            System.out.println("Enter First Name: ");
            contactPerson.setFirstName(sc.next());
            System.out.println("Enter Last Name: ");
            contactPerson.setLastName(sc.next());
            System.out.println("Enter Address Name: ");
            contactPerson.setAddress(sc.next());
            System.out.println("Enter City Name: ");
            contactPerson.setCity(sc.next());
            System.out.println("Enter State Name: ");
            contactPerson.setState(sc.next());
            System.out.println("Enter Email: ");
            contactPerson.setEmail(sc.next());
            System.out.println("Enter Zip Code: ");
            contactPerson.setZip(sc.nextInt());
            System.out.println("Enter Mobile Number: ");
            contactPerson.setPhoneNumber(sc.nextLong());

            contactPersonArrayList.add(contactPerson);
        }
    }

    public boolean duplicateCheck() {
        if (contactPersonArrayList == null) {
            return false;
        }
        if (!contactPersonArrayList.isEmpty()) {
            System.out.println("Enter First Name to check: ");
            String name = sc.next();
            for (int j = 0; j < contactPersonArrayList.size(); j++) {
                if (name.equals(contactPersonArrayList.get(j).getFirstName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void showContact() {
        for (int i = 0; i < contactPersonArrayList.size(); i++) {
            ContactPerson contacts = contactPersonArrayList.get(i);
            System.out.println(contacts.toString());

        }
    }

    public void editContact() {
        System.out.println("Enter First Name To Edit:");
        String name = sc.next();
        for (ContactPerson cp : contactPersonArrayList) {
            if (cp.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Enter First Name: ");
                cp.setFirstName(sc.next());
                System.out.println("Enter Last Name: ");
                cp.setLastName(sc.next());
                System.out.println("Enter Address Name: ");
                cp.setAddress(sc.next());
                System.out.println("Enter City Name: ");
                cp.setCity(sc.next());
                System.out.println("Enter State Name: ");
                cp.setState(sc.next());
                System.out.println("Enter Email: ");
                cp.setEmail(sc.next());
                System.out.println("Enter Zip Code: ");
                cp.setZip(sc.nextInt());
                System.out.println("Enter Mobile Number: ");
                cp.setPhoneNumber(sc.nextLong());
                break;
            } else {
                System.out.println("Contact Doesn't Exist:");
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter First Name To Delete:");
        String name = sc.next();
        for (ContactPerson cp : contactPersonArrayList) {
            if (cp.getFirstName().equalsIgnoreCase(name)) {
                contactPersonArrayList.remove(cp);
                System.out.println("!!Deleted!!");
                break;
            } else {
                System.out.println("Doesn't exist.");
            }

        }
    }
}
