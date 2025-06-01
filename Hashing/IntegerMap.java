package Hashing;

import java.util.*;

public class IntegerMap {
    static void mapInteger(int arr[]) {
        Map<Integer, Integer> mapList = new HashMap<>();
        int hashArr[] = new int[13];

        for (int j = 0; j < arr.length; j++)
            mapList.put(arr[j], ++hashArr[arr[j]]);

        System.out.println(mapList);

        // Playing with Map
        System.out.println(mapList.get(4));
        System.out.println(mapList.keySet());
        System.out.println(mapList.values());
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 4, 2, 2, 1, 1, 12, 12, 6 };
        mapInteger(arr);
    }
}
