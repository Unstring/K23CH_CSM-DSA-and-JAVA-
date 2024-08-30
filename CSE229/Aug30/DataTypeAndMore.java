public class DataTypeAndMore {
    public static void main(String[] args) {
        int a; // Declaration
        a = 7; // Initialized
        int b = 12; // Declaration and Initialization in same line
        double d = ((double)a + (double)b) / 2; //casting int into double for accuracy
        System.out.println("(" + a + " + " + b + ") = " + d);
    }
}
