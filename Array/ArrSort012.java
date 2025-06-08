package Array;

import java.util.Arrays;

public class ArrSort012 {

    // Approach 01: ) Brute Force Approach
    // public static void main(String[] args) {
    // int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
    // int count0 = 0;
    // int count1 = 0;
    // int count2 = 0;

    // for (int i : arr) {
    // if (i == 0)
    // count0++;
    // else if (i == 1)
    // count1++;
    // else
    // count2++;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (i < count0)
    // arr[i] = 0;
    // else if (i >= count0 && i < (count0 + count1))
    // arr[i] = 1;
    // else
    // arr[i] = 2;
    // }

    // for (int i : arr) {
    // System.out.print(i + " ");
    // }
    // }

    // Optimal Approach : ) using Dutch National Flag Algorithm..
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1, 2, 1, 2, 0, 2, 1 };
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
