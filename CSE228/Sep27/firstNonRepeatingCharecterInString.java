import java.util.HashMap;
import java.util.Set;

public class firstNonRepeatingCharecterInString {
    public static void main(String[] args) {
        String str = "somethingspeacial";

        char resCh = getFirstUniqueueChar(str);
        System.out.println(resCh);
    }

    private static char getFirstUniqueueChar(String str){

        HashMap<Character, Integer> charMap = new HashMap<>();
        char resCh = '_';
        for (int i = 0; i < str.length(); i++) {
            char currCh = str.charAt(i);
            if (charMap.containsKey(currCh)) {
                int previousCount = charMap.get(currCh);
                charMap.put(currCh, previousCount + 1);
            }else{
                charMap.put(currCh, 1);
            }
        }

        System.out.println(charMap);

        for (char ch : str.toCharArray()) {
            if (charMap.get(ch) == 1) {
                return ch;
            }
        }

        return resCh;
    }
}
