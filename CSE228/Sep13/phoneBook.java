import java.util.Hashtable;
import java.util.Set;

public class phoneBook {
    public static void main(String[] args) {
        Hashtable<String, String> phoneBook = new Hashtable<>();
        
        phoneBook.put("Amit Anand", "9876543210a");
        phoneBook.put("Amit Anand1", "9876543210b");
        phoneBook.put("Amit Anand", "9876543210c");
        phoneBook.put("Amit Anand", "9876543210d");
        phoneBook.put("Amit Anand2", "9876543210e");
        phoneBook.put("Amit Anand", "9876543210f");

        // System.out.println(phoneBook);

        // System.out.println(phoneBook.get("Amit Anand"));

        Set<String> phoneBookKeyset = phoneBook.keySet();

        // System.out.println(phoneBookKeyset);

        for(String key : phoneBookKeyset) {
            System.out.println(key + " : " + phoneBook.get(key));
        }
    }
    
}
