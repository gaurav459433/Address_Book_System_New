package addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ContactPerson cp = new ContactPerson();

    public void addContact() {
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

    }

    public void showContact() {
        System.out.println(cp.toString());
    }
}
