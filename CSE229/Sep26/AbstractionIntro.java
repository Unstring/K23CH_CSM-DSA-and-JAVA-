import java.util.Scanner;

public class AbstractionIntro {
    public static void main(String[] args) {
        System.out.println("please write your sentance!");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String result = reverseWords(str);
        System.out.println(result);
    }

    private static String reverseWords(String str) {
        String res = "";
        String[] arrStr = str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            String word = arrStr[i];
            String revWord = reverseCharectersIn(word);
            if (i == arrStr.length - 1) {
                res += revWord;
            } else {
                res += revWord + " ";
            }
        }
        // for (String word : arrStr) {
        //     String revWord = reverseCharectersIn(word);
        //     res += revWord + " ";
        // }
        return res;
    }

    private static String reverseCharectersIn(String word) {
        String res = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            res += ch;
        }
        return res;
    }
}
