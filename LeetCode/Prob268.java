public class Prob268 {
    // Brute Force Solution
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isAvail = false;
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    isAvail = true;
                    break;
                }
            }
            if (!isAvail)
                return i;
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };
        int val = missingNumber(arr);
        System.out.println(val);
    }
}
