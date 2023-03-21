package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<ContactPerson> contactPersonArrayList = new ArrayList<ContactPerson>();

    public void addContact() {
        ContactPerson contactPerson = new ContactPerson();
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
