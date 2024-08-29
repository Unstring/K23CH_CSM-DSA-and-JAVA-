import java.util.*;

public class arrayInJava {
    public static void main(String[] args) {
        String nameOfString = "String";

        String str = nameOfString.toUpperCase();
        String str1 = nameOfString.toLowerCase();

        char[] charArr = nameOfString.toCharArray(); // array to iterate over each character

        // use foe loop and use .charAt(i) to iterate over each character
        String charArrayString = Arrays.toString(charArr);

        String names = "Rishi, Kartik, Shubham, Rahul, Shubhranjali, Komal";
        String[] nameArray = names.split(", ");
        
        // System.out.println(nameOfString);
        // System.out.println(str);
        // System.out.println(str1);
        System.out.println(charArrayString);
        System.out.println(Arrays.toString(nameArray));
    }
}
