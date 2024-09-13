import java.util.Hashtable;
import java.util.Scanner;

class contactBook{
    Hashtable<String, String> contacts = new Hashtable<String, String>();

    public void addContact(String name, String number){
        contacts.put(name, number);
    }

    public void searchContact(String str){

        int counter = 0;

        for (String key : contacts.keySet()) {
            if(key.contains(str)){
                System.out.println(key + ": " + contacts.get(key));
            }
        }

        if(counter != 0){
            System.out.println(counter + ": contacts found");
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

    public void displayContacts(){
        System.out.println(contacts);
    }
}

public class firstConsoleApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        contactBook cb = new contactBook();

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
                    return;
                case "add":
                    System.out.println("please enter the name: ");
                    String name = scn.nextLine();
                    System.out.println("please enter the phone number");
                    String number = scn.nextLine();
                    cb.addContact(name, number);
                    System.out.println("name: " + name + " phone: " + number + " saved in contact book!");
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
                    System.out.print("\n>>>");
                    break;
                case "view":
                    System.out.println("here is all the contacts!");
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
