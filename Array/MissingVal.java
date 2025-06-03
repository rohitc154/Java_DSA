package Array;

public class MissingVal {
    // ----------1:)) Brute Force Approach
    // public static int missingNumber(int[] nums) {
    // int n = nums.length;
    // for (int i = 0; i < n; i++) {
    // boolean isAvail = false;
    // for (int j = 0; j < n; j++) {
    // if (i == nums[j]) {
    // isAvail = true;
    // break;
    // }
    // }
    // if (!isAvail)
    // return i;
    // }
    // return n;
    // }

    // ---------2 :) Using Hashing
    // public static int missingNumber(int[] nums) {
    //     int[] hashArr = new int[nums.length + 1];
    //     int val = 0;
    //     for (int i = 0; i < nums.length; i++)
    //         hashArr[nums[i]] = 1;

    //     for (int i = 0; i < hashArr.length; i++) {
    //         if (hashArr[i] == 0)
    //             return i;
    //     }
    //     return nums.length;
    // }

    // -------------3.1:) Optimal Approach using Summation
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int s1 = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return s1-sum;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1,2 };
        int val = missingNumber(arr);
        System.out.println(val);
    }
}
