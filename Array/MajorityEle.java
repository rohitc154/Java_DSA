package Array;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    static void majorElement(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        int maxFreq = -1;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            maxFreq = i.getValue();
            maxKey = i.getKey();
        }
        System.out.println(maxFreq + "  " + maxKey);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 2, 2, 2, 3, 9, 2, 2, 4, 6, 2, 2, 2, 22 };
        majorElement(arr, (arr.length) / 2);
    }
}
