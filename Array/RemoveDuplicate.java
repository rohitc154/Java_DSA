package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 3, 4, 4 };

        // 1 -----------------------------:) Brute force method using, set
        // Set<Integer> set = new HashSet<>();
        // for (int e : arr) {
        // set.add(e);
        // }
        // int i = 0;
        // for (Integer integer : set) {
        // arr[i] = integer;
        // i++;
        // }
        // System.out.println(set);
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // 2 :)) Use Inplace remove duplicacy
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] !=arr[index] ) {
                arr[index+1] = arr[j];
                index++;
            }
        }
        // for (int i : arr) {
        //     System.out.print(i + "  ");
        // }
        System.out.println(index+1);
    }
}
