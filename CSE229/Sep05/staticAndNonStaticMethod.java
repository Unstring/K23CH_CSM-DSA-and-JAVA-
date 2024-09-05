
public class staticAndNonStaticMethod {

    // Static method
    public static void printStaticMessage() {
        System.out.println("This is a static method.");
    }   

    // non static method
    public void printNonStaticMessage() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        staticAndNonStaticMethod printNonStatic = new staticAndNonStaticMethod();
        printStaticMessage();
        printNonStatic.printNonStaticMessage();
    }
}
