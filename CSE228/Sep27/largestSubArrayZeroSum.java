import java.util.HashMap;
import java.util.Scanner;

public class largestSubArrayZeroSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int[] arr = {8, -2, 2, 1, 7, -8, 20, 23};
        System.out.println("please enter the length of the main array first:");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("please enter the element at index " + i);
            arr[i] = scn.nextInt();
        }
    
        int res = getMaxArrLength(arr);

        System.out.println("possible maximum length of subarray having zero sum is: " + res);
    }

    private static int getMaxArrLength(int[] arr) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<Integer, Integer>(); // sum : index
        prefixSumMap.put(0, -1);
        int prefixSum = 0;
        int resSize = 0;
        for (int currentIndex = 0; currentIndex < arr.length; currentIndex++) {
            prefixSum += arr[currentIndex];

            if (prefixSumMap.containsKey(prefixSum)) {
                int previousIndex = prefixSumMap.get(prefixSum);
                int tempSize = currentIndex - previousIndex;
                if (resSize < tempSize) {
                    resSize = tempSize;
                }
            }else{
                prefixSumMap.put(prefixSum, currentIndex);
            }
        }
        return resSize;
    }

    private static int getMaxArrLengthBF(int[] arr) {
        int maxPossibleLength = 0;
        for (int i = 0; i < arr.length; i++) { // 
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    int size = j - i + 1;
                    if (maxPossibleLength < size) {
                        maxPossibleLength = size;
                    }
                }
            }
            
        }
        return maxPossibleLength;
    }
    
}
