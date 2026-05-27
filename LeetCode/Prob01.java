
import java.util.HashMap;

class Prob01 {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapArr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if (mapArr.containsKey(comp)) {
                return new int[] { mapArr.get(comp), i };
            }
            mapArr.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 18;

        int[] op = twoSum(nums, target);
        System.out.println(op[0]);
        System.out.println(op[1]);
    }
}