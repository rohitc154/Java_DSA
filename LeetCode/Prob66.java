/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. */

public class Prob66 {

    static long plusOne(int[] digits) {
        long val = 0;
        if (digits.length <= 100 && digits.length >= 1) {
            for (int i : digits) {
                if (i >= 0 && i <= 9) {
                    val += i;
                }
            }
        }
        return val + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 9 };
        int count = 0;

    }
}
