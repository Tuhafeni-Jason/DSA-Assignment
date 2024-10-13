import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    // Insert a new contact
    public void insertContact(String name, String number) {
        Contact contact = new Contact(name, number);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Search for a contact by name
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phonebook is empty.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // Delete a contact by name
    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Update a contact's number by name
    public void updateContact(String name, String newNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setNumber(newNumber);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Sort contacts alphabetically by name
    public void sortContacts() {
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getName().compareToIgnoreCase(c2.getName());
            }
        });
        System.out.println("Contacts sorted successfully.");
    }
}
