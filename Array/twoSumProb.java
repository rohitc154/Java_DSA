package Array;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumProb {

    // ---------------:)) Brute Force : 01
    // static void findItYar(int[] numbers, int target) {
    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i+1; j < numbers.length; j++) {
    // if (i == j)
    // continue;
    // else if (numbers[i] + numbers[j] == target) {
    // System.out.println(numbers[i] + " " + numbers[j]);
    // }
    // }
    // }
    // }

    // --------------------:)) Better Approach : 02
    // Returning array of which contains the "index + 1" value
    static int[] findItYar(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++)
            map.put(numbers[i], i);

        int temp[] = new int[2];
        // Arrays.fill(temp, -1);
        for (int i = 0; i < numbers.length; i++) {
            int comp = target - numbers[i];
            if (map.containsKey(comp)) {
                // System.out.println(i + " " + map.get(comp));
                temp[0] = i + 1;
                temp[1] = map.get(comp) + 1;
                return temp;
            }
        }
        return new int[] { -1, -1 };
        // System.out.println("No Value Found !");

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 7, 11, 15 };
        int target = 9;
        int val[] = findItYar(numbers, target);
        for (int i : val) {
            System.out.println(i);
        }
    }
}
