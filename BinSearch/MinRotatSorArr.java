public class MinRotatSorArr {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                ans = (ans < nums[low]) ? ans : nums[low];
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = (ans < nums[mid]) ? ans : nums[mid];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 0, 1 };
        int result = findMin(arr);
        System.out.println("Result : " + result);
    }
}
