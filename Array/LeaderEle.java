package Array;

import java.util.ArrayList;

public class LeaderEle {

    // Brute Force approach
    // public static void main(String[] args) {
    // int arr[] = { 10, 22, 12, 3, 0, 6 };

    // for (int i = 0; i < arr.length; i++) {
    // boolean leader = false;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] > arr[i]) {
    // leader = true;
    // break;
    // }
    // }
    // if (!leader) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // Optimal Approach
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        int maxVal = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                list.add(maxVal);
            }
        }
        System.out.println(list);
    }
}
