import java.util.Scanner;

public class checkPelindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("please type a word to check if it is a Pelindrome: ");
        String word = scn.next();
        scn.close();

        boolean isPalindrome = isWordPalindrome(word);

        System.out.println("Is word: " + word + " a palindrome: " + isPalindrome);
    }

    private static boolean isWordPalindrome(String word) {

        // write your code here!
        return true;
    }
}