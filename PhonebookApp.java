import java.util.Scanner;

public class PhonebookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        while (true) {
            System.out.println("1. Insert Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    phonebook.insertContact(name, number);
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    phonebook.searchContact(name);
                    break;
                case 3:
                    phonebook.displayAllContacts();
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    name = scanner.nextLine();
                    phonebook.deleteContact(name);
                    break;
                case 5:
                    System.out.print("Enter name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new number: ");
                    number = scanner.nextLine();
                    phonebook.updateContact(name, number);
                    break;
                case 6:
                    phonebook.sortContacts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
