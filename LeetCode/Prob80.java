public class Prob80 {
    public static int removeDuplicates(int[] nums) {

        int temp = 0;
        int mov = 1;
        int count = 0;
        while (mov < nums.length) {
            if (nums[temp] == nums[mov] && count < 2) {
                count++;
                temp++;
                mov++;

            } else if (nums[temp] == nums[mov] && count > 2) {
                mov++;

            } else {
                count = 0;
                nums[temp] = nums[mov];
                mov++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        return temp + 1;
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 1, 2 };
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
