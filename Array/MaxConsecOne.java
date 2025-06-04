package Array;

import java.util.HashSet;
import java.util.Set;

public class MaxConsecOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = count > max ? count : max;
            } else
                count = 0;

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
