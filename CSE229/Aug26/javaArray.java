package CSE229.Aug26;

import java.util.Arrays;

/**
 * javaArray
 */
public class javaArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] nums = numbers;

        String numsStr1 = Arrays.toString(nums);
        System.out.println(numsStr1);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        String numsStr2 = Arrays.toString(nums);
        System.out.println(numsStr2);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 3;
        }
        String numsStr3 = Arrays.toString(numbers);
        System.out.println(numsStr3);

        for (int num : nums) {
            System.out.println(num);
        }


        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
    }
}