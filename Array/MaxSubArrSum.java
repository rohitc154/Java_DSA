package Array;

import java.sql.Array;
import java.util.ArrayList;

public class MaxSubArrSum {
    // public static void main(String[] args) {
    // int maxR = Integer.MIN_VALUE;
    // ArrayList<Integer> list = new ArrayList<>();
    // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    // for (int i = 0; i < arr.length; i++) {
    // int max = 0;
    // for (int j = i; j < arr.length; j++) {

    // max += arr[j];
    // if (max > maxR) {
    // list.add(arr[j]);
    // maxR = max;
    // // System.out.println(maxR);
    // }
    // }
    // }
    // System.out.println(maxR);
    // System.out.println(list);
    // }

    // Optimal Arrproach using : Kadene's Algorithm
    public static void main(String[] args) {
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int max = Integer.MIN_VALUE;
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }
    }
}
