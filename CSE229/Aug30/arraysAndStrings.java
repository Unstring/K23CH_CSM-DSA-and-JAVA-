public class arraysAndStrings {
    public static void main(String[] args) {
        String st =  new String("hello world");
        String str = "hello world";
        String str1 = "hello world";
        String str2 = str;
        str = str + "1";

        System.out.println(st == str); // false, String is object and stored in heap
        System.out.println(st.equals(str)); // true, both string are same

        System.out.println(str == str1); // true, both string are same and stored in string pool
        System.out.println(str == str2); // true, both string are same and stored in string pool
        System.out.println(str1.equals(str)); // true, both string are same
    }
}