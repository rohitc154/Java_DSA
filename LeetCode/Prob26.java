
public class Prob26 {

    public static int removeDuplicates(int[] nums) {

        // Approach 01
        // List<Integer> listArr = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        // if (!listArr.contains(nums[i])) {
        // listArr.add(nums[i]);
        // }
        // }

        // for (int i = 0; i < listArr.size(); i++) {
        // if (i < listArr.size()) {
        // nums[i] = listArr.get(i);
        // }
        // }
        // return listArr.size();

        // Approach 02
        int temp = 1;
        int mov = 2;
        while (mov < nums.length) {
            if (nums[temp] == nums[mov] && nums[mov] == nums[temp - 1]) {
                mov++;
            } else {
                nums[++temp] = nums[mov];
                mov++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
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
