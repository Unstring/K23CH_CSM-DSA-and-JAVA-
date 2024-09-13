import java.util.Hashtable;
import java.util.Scanner;

class contactBook{
    
}

public class firstConsoleApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Hashtable<String, String> contacts = new Hashtable<String, String>();

        System.out.println("How many contacts you want to save enter a number: ");

        int numberOfContacts = scn.nextInt();

        scn.nextLine(); // to consume newline character left by nextInt() method.

        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter the name of user" + (i + 1) + ": ");
            String Name = scn.nextLine();
            System.out.println("Enter the Number of the same user" + (i + 1) + ": ");
            String Number = scn.nextLine();

            contacts.put(Name, Number);
        }
        scn.close();

        System.out.println("Your contact list: \n" + contacts);
    }
}
