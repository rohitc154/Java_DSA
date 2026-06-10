/*Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1. */

import java.util.HashMap;
import java.util.Map;

class Prob525 {
    public int findMaxLength(int[] nums) {
        // Maps prefix sum -> earliest index where it appeared
        Map<Integer, Integer> firstIndex = new HashMap<>();
        
        // Base case: prefix sum 0 occurs before array starts
        firstIndex.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 -> -1, 1 -> +1
            sum += (nums[i] == 0) ? -1 : 1;

            if (firstIndex.containsKey(sum)) {
                // If we've seen this sum before, compute subarray length
                maxLen = Math.max(maxLen, i - firstIndex.get(sum));
            } else {
                // Store earliest index for this sum
                firstIndex.put(sum, i);
            }
        }

        return maxLen;
    }
}

