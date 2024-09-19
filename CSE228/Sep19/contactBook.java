import java.util.Hashtable;
import java.util.HashMap;
import java.util.Scanner;

class contactBookHelper{
    // Hashtable<String, String> contacts = new Hashtable<String, String>();
    HashMap<String, String> contacts = new HashMap<String, String>();

    public boolean addContact(String name, String number){
        if (contacts.containsKey(name)) {
            System.out.println("contact name already exists!");
            return false;
        }else{
            contacts.put(name, number);
            return true;
        }
    }

    public void searchContact(String str){

        int counter = 0;

        System.out.println("searching contacts...\nHere is the list of contacts");

        for (String key : contacts.keySet()) {
            if(key.contains(str)){
                System.out.println(key + ": " + contacts.get(key));
                counter++;
            }
            if(contacts.get(key).contains(str)){
                System.out.println(key + ": " + contacts.get(key));
                counter++;
            }
        }

        if(counter != 0){
            System.out.println("\n" + counter + ": contacts found");
        } else {
            System.out.println("contact not found!");
        }
    }

    public void deleteContact(String name){
        contacts.remove(name);
    }

    public void updateContact(String name, String number){
        contacts.put(name, number);
    }

    public boolean isNameAvailable(String Name){
        return contacts.containsKey(Name);
    }

    public void displayContacts(){
        int size = contacts.size();
        if (size == 0) {
            System.out.println("there is no contacts to display!");
        } else {
            System.out.println("total " + size + " contacts available here is the list:");
            for (String key : contacts.keySet()) {
                System.out.println(key + ": " + contacts.get(key));
            }
        }
    }
}

public class contactBook {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        contactBookHelper cb = new contactBookHelper();

        System.out.println("this is a REPL app for contacts using java!\nacceptable commands are 'add', 'remove', 'update', 'view', 'search' and 'exit' ");
        System.out.print("\n>>>");

        String command;

        while (true) {
            command = scn.next().toLowerCase();

            scn.nextLine();
            
            switch (command) {
                case "exit":
                    System.out.println("thank you for using this contacts application!");
                    System.out.print("\n>>>");
                    scn.close();
                    return;
                case "add":
                    System.out.println("please enter the name: ");
                    String name = scn.nextLine();
                    System.out.println("please enter the phone number");
                    String number = scn.nextLine();
                    boolean cba = cb.addContact(name, number);
                    if (cba) {
                        System.out.println("name: " + name + " phone: " + number + " saved in contact book!");
                    }
                    System.out.print("\n>>>");
                    break;
                case "remove":
                    System.out.println("please Enter the name of the contact you want to remove");
                    name = scn.nextLine();
                    cb.deleteContact(name);
                    System.out.println("contact for " + name + " removed!");
                    System.out.print("\n>>>");
                    break;
                case "update":
                    System.out.println("please enter the name of the contact you want to update");
                    name = scn.nextLine();
                    if (!cb.isNameAvailable(name)) {
                        System.out.println("name not found!");
                        System.out.print("\n>>>");
                        break;
                    }
                    System.out.println("please enter the new phone number");
                    number = scn.nextLine();
                    cb.updateContact(name, number);
                    System.out.print("\n>>>");
                    break;
                case "view":
                    cb.displayContacts();
                    System.out.print("\n>>>");
                    break;
                case "search":
                    System.out.println("please enter the keyword you want to search for!");
                    String str = scn.nextLine();
                    cb.searchContact(str);
                    System.out.print("\n>>>");
                    break;
                default:
                    System.out.println("Invalid command please enter a right command!");
                    System.out.print("\n>>>");
                    break;
            }
        }
    }
}
