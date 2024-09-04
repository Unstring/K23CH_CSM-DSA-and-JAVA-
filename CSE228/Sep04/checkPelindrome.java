import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class checkPelindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("please type a word to check if it is a Pelindrome: ");
        String word = scn.next();
        scn.close();

        // boolean isPalindrome = isWordPalindrome(word);
        boolean isPalindrome = isWordPalindromeUsingStackAndQueue(word);

        System.out.println("Is word: " + word + " a palindrome: " + isPalindrome);
    }

    private static boolean isWordPalindromeUsingStackAndQueue(String word) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        char[] chars = word.toCharArray();

        for (char c : chars) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty() &&!queue.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();

            if (stackChar!= queueChar) {
                return false;
            }
        }

        return true;
    }

    private static boolean isWordPalindrome(String word) {

        // write your code here!
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            char c0 = word.charAt(i);
            char c1 = word.charAt(length - 1 - i);
            if (c0 != c1) {
                return false;
            }
        }

        return true;
    }


}