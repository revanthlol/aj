import java.util.*;
import java.io.*;

class Contact {
    String name, address, phone;

    Contact(String n, String a, String p) {
        name = n;
        address = a;
        phone = p;
    }

    public String toString() {
        return name + " | " + address + " | " + phone;
    }
}

public class AddressBookApp {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> list = new ArrayList<>();
    static final String FILE_NAME = "contacts.txt";

    static void loadContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|", -1);
                if (parts.length == 3) {
                    list.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts.");
        }
    }

    static void saveContacts() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Contact c : list) {
                pw.println(c.name + "|" + c.address + "|" + c.phone);
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts.");
        }
    }

    public static void main(String[] args) {
        loadContacts();
        int ch;

        do {
            System.out.println("\n1.Add 2.View 3.Edit 4.Rename 5.Delete 6.Search 7.Exit");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Address: ");
                    String a = sc.nextLine();
                    System.out.print("Phone: ");
                    String p = sc.nextLine();
                    list.add(new Contact(n, a, p));
                    saveContacts();
                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i + 1) + ". " + list.get(i));
                    break;

                case 3:
                    System.out.print("Contact No: ");
                    int i = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("New Address: ");
                    list.get(i).address = sc.nextLine();
                    System.out.print("New Phone: ");
                    list.get(i).phone = sc.nextLine();
                    saveContacts();
                    break;

                case 4:
                    System.out.print("Contact No: ");
                    i = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("New Name: ");
                    list.get(i).name = sc.nextLine();
                    saveContacts();
                    break;

                case 5:
                    System.out.print("Contact No: ");
                    list.remove(sc.nextInt() - 1);
                    sc.nextLine();
                    saveContacts();
                    break;

                case 6:
                    System.out.println("Search by Name: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Contact c : list) {
                        if (c.name.equalsIgnoreCase(searchName)) {
                            System.out.println(c);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                
            }
        } while (ch != 7);
    }
}