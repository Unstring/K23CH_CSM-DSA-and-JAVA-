package CSE229.Aug26;
import java.util.Arrays;





public class ArraysInJava {
    public static void main(String[] args) {
        int[] arr = new int[5];


        int arr2[] = {0, 1, 2, 3, 4, 5};
        // System.out.println(arr);

        // System.out.println(arr[0]);
        // System.out.println(arr2[3]);
        // printArray(arr);
        // printArray(arr2);

        arr[1] = 100;

        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[] arr) {
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
}
