public class DataTypeAndMore {
    public static void main(String[] args) {
        int a; // Declaration
        a = 7; // Initialized
        int b = 12; // Declaration and Initialization in same line
        double d = ((double)a + (double)b) / 2; //casting int into double for accuracy
        System.out.println("(" + a + " + " + b + ") = " + d);


        // we have two types of memory (stack and heap)
        // where does this data initialized by int and double get stored?
        // correct answer is stack because all premitive data types get stored in stack

        // String is a class in Java, it is an object, and it gets stored in heap

        int ch = 'a';
        System.out.println("Ascii value of " + ch + " is " + ch);
        char che = 49;
        System.out.println("Character value of " + (int)che + " is " + che);
    }
}
