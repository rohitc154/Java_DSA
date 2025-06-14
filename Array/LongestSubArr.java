package Array;

import java.util.ArrayList;

public class LongestSubArr {

    int longSubArrWithSumK(ArrayList<Integer> list, long k){
        long sum = 0;
        int maxLen = 0;
        for (Integer integer : list) {
            sum += integer;
            if (sum == k){
                maxLen = (maxLen > list.indexOf(integer)) ? maxLen : list.indexOf(integer);
            }
            long rem = sum - k ;
            if (list.find) {
                
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
