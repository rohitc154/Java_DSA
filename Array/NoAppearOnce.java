package Array;

import java.util.HashMap;
import java.util.Map;

public class NoAppearOnce {

    // 1:)-------------------- Using Brute Force Approach
    // public static void main(String[] args) {
    // int arr[] = { 1, 1, 2, 3, 3, 4, 4 };
    // for (int i = 0; i < arr.length; i++) {
    // boolean isAvail = true;
    // // int temp = arr[i];
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i] == arr[j] && i != j) {
    // isAvail = false;
    // break;
    // }
    // }
    // if (isAvail) {
    // System.out.println(arr[i]);
    // break;
    // }
    // }
    // }

    // 2:)-----------------Better Approach using Map Datastructure
    // public static void main(String[] args) {
    // Map<Integer, Integer> map = new HashMap<>();

    // int arr[] = { 1, 2, 1, 3, 8, 8, 3 };
    // for (int i = 0; i < arr.length; i++)
    // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    // if (entry.getValue() == 1)
    // System.out.println(entry.getValue());
    // }
    // }

    // 3)--------------Optimal Solution
    /*
     * Property of XOR is : XOR with number itself is 0 and XOR with 0 is number
     */
    public static void main(String[] args) {
        int xor = 0;
        int arr[] = { 1, 2, 1, 3, 8, 8, 3 };

        for (int i = 0; i < arr.length; i++)
            xor = xor ^ arr[i];

        System.out.println("unique Value is : " + xor);
    }

}
