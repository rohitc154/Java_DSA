/*
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class Prob189 {
    public static void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k % len;
        int temp[] = new int[k];

        for (int i = 0; i < k; i++)
            temp[i] = nums[len - k + i];

        for (int i = len - k - 1; i >= 0; i--) {
            nums[k + i] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        for (int i : nums)
            System.out.print(i + "  ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
    }
}
