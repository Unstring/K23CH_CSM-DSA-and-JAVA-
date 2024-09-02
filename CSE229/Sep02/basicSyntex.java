import java.util.*;
import java.io.*;

public class basicSyntex {

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


    public static void main(String[] yourName) {
        String[] names = {"name1", "name2", "name3"};

        System.out.println("args length: " + yourName.length);
        printArray(yourName);
        System.out.println("names length: " + names.length);
        printArray(names);
        
    }
}

class anotherClass {
    private int i;
    private String[] arrStr;

    anotherClass(int i, String[] arrStr) {
        this.i = i;
        this.arrStr = arrStr;
    }

    boolean setI(int value){
        this.i = value;
        return this.i == value;
    }

    int getI() {
        return this.i;
    }
    
}