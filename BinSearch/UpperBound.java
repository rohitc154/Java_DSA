public class UpperBound {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int boundIndex = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                boundIndex = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return boundIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };
        int result = search(arr, 6);
        System.out.println(result);
    }
}
