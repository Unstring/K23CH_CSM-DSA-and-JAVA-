







public class staticExample {

    public static void printStatic(){
        System.out.println("Hello");
    }

    public void printNonStatic(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        printStatic();

        staticExample obj = new staticExample();
        obj.printNonStatic();
    }
}