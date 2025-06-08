package Array;

import java.util.Arrays;

public class TwoSumGreedy {
    static void findItYar(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                System.out.println("Mil gya !!!");
                break;
            } else if (arr[start] + arr[end] > target) {
                // System.out.println(arr[end]);
                end--;
            } else if (arr[start] + arr[end] < target) {
                // System.out.println(arr[start]);
                start++;
            }
        }
        if (start >= end)
            System.out.println("Value not found");

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3, 7 };
        int target = 10;
        findItYar(arr, target);
    }
}
