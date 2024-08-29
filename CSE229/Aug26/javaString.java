package CSE229.Aug26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class javaString {
    public static void main(String[] args) {
        // String str = "Hello, World!";

        // char firstChar = str.charAt(0);
        // System.out.println(firstChar);
        // int length = str.length();
        // System.out.println(length);
        // String greeting = str + " How are you?";
        // System.out.println(greeting);
        // String hello = str.substring(0, 5);
        // System.out.println(hello);
        // boolean isEqual = str.equals("Hello, World!");
        // System.out.println(isEqual);
        // String sentence = "  Java Programming is fun!  ";

        // String trimmed = sentence.trim();

        // String upperCase = trimmed.toUpperCase();

        // String replaced = upperCase.replace("FUN", "AWESOME");

        // String[] words = replaced.split(" ");

        // System.out.println(Arrays.toString(words));

        // String str1 = "abcd";

        // char[] charArray = str1.toCharArray();

        // charArray[0] = 'z';

        // String modifiedStr = new String(charArray);
        // System.out.println(modifiedStr);

        String abc = "ABC";
        int[] charArray = abc.chars().toArray();
        System.out.println(abc.chars());
        System.out.println(Arrays.toString(charArray));

        abc.chars().forEach(c -> System.out.println((char) c + " "));

        System.out.println(abc.codePointAt(0));

        System.out.println(abc.codePointBefore(1));
        System.out.println(abc.codePointCount(0,3));

    }
}
