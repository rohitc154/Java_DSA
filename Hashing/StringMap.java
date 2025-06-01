package Hashing;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
    static void strMap(String str) {
        Map<Character, Integer> mapList = new HashMap<>();
        int hashArr[] = new int[26];

        int i = 0;
        while (i < str.length()) {
            int a = str.charAt(i) - 'a'; // Calculating index at which the character resides
            mapList.put(str.charAt(i), ++hashArr[a]);
            i++;
        }
        System.out.println(mapList);
    }

    public static void main(String[] args) {
        String str = "avcxzrsaczxvcxx";
        strMap(str);
    }
}
