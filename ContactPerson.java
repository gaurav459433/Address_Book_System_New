package addressbook;

public class ContactPerson {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private long phoneNumber;

    @Override
    public String toString() {
        return "ContactPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
