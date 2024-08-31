public class arraysAndStrings {
    public static void main(String[] args) {
        String st =  new String("hello world");
        String str = st;
        String str1 = "hello world";
        String str2 = str;

        System.out.println(st);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(st == str);
        System.out.println(st == str1);
        System.out.println(st == str2);
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str1 == str2);


        str = str + "1";

        System.out.println(st);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(st == str);
        System.out.println(st == str1);
        System.out.println(st == str2);
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str1 == str2);


        // discuss few very popular and frequently used methods in java

        boolean bl = str1.equals(st);
        System.out.println(bl);
        
    }
}