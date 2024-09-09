import java.util.Hashtable;
import java.util.Set;

public class heighestFrequencyChar {
    public static void main(String[] args) {
        String str = "abracadabra";

        char hfc = getHeighestFrequencyChar(str);

        System.out.println("Heighest frequency character in " + str + " is " + hfc);
    }

    private static char getHeighestFrequencyChar(String str) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            if (table.containsKey(c)) {
                table.put(c, table.get(c) + 1);
                maxCount = Math.max(maxCount, table.get(c));
            } else {
                table.put(c, 1);
            }
        }

        Set<Character> keys = table.keySet();

        for (Character character : keys) {
            if (table.get(character) == maxCount) {
                return character;
            }
        }

        return '\0';
    }
}
