import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prob349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int val : nums1) {
            set.add(val);
        }
        for (int val : nums2) {
            if (set.contains(val)) {
                resultSet.add(val);
            }
        }
        int i = 0;
        int result[] = new int[resultSet.size()];
        for (Integer e : resultSet) {
            result[i] = e;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 9, 5 };
        int arr2[] = { 9, 4, 9, 8, 4 };
        int[] arr = intersection(arr1, arr2);
        for (int i : arr) {

            System.out.println(i);
        }
    }
}
