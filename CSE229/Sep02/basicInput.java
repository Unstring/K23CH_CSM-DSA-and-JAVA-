import java.util.Scanner;

public class basicInput{

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }


    public static void main(String[] args){
        Scanner yourScannerName = new Scanner(System.in);

        // System.out.print("Enter any number in int range: ");
        // int n = yourScannerName.nextInt();
        // System.out.println("Entered number: " + n);

        System.out.print("Enter a parahraph: ");
        String para = yourScannerName.nextLine();
        System.out.println("Entered paragraph: " + para);

        String[] paraStr = para.split(" ");

        printArray(paraStr);

        yourScannerName.close();
    }
}