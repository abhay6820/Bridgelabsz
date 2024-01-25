import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}

class AddressBook {
    ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void printContacts() {
        System.out.println("Contacts in Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

class UC1_CreateContact {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        createContact(addressBook);
        addressBook.printContacts();
    }

    public static void createContact(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        addressBook.addContact(contact);
    }
}

class UC2_AddNewContact {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addNewContact(addressBook);
        addressBook.printContacts();
    }

    public static void addNewContact(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add new contact:");
            createContact(addressBook);

            System.out.print("Do you want to continue adding contacts? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                break;
            }
        }
    }

    public static void createContact(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        addressBook.addContact(contact);
    }
}
// Similar implementations for UC3_UpdateExistingContact and UC4_DeleteContact can be added.
