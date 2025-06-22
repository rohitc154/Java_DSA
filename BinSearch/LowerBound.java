// package BinSearch;

public class LowerBound {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int boundIndex = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
                boundIndex = mid;
            } else
                start = mid + 1;
        }
        return boundIndex;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int result = search(arr, 8);
        System.out.println(result);
    }
}
