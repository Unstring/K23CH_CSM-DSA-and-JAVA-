import java.util.Hashtable;
import java.util.Set;


public class hashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(46, "Suprabhat");
        table.put(60, "Harnoor");
        table.put(34, "Nissi");
        table.put(58, "Komal");
        table.put(38, "Praneeth");

        System.out.println(table);

        table.put(38, "Unnamed");

        System.out.println(table);

        String valueForRoll34 = table.get(34);

        System.out.println("Roll " + 34 + " Name: " + valueForRoll34);

        int s = table.size();

        System.out.println("Size of table is: " + s);

        Set<Integer> keys = table.keySet();
        
        System.out.println(keys);

        for (Integer key : keys) {
            System.out.println("Roll " + key + " Name: " + table.get(key));
        }
    }
}