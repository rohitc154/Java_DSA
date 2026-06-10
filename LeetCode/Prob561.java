
import java.util.Arrays;

/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum. */

public class Prob561 {
    public static  int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            sum += Math.min(nums[i], nums[i+1]);
            i++;
        }
        return  sum;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}