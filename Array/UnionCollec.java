package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionCollec {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list1.addAll(Arrays.asList(1, 1, 2, 3, 4, 5));
        list2.addAll(Arrays.asList(2, 3, 4, 4, 5));

        // -------------1:) Brute Force Approach : First Approach
        // for (Integer integer : list1)
        // set.add(integer);
        // for (Integer integer : list2)
        // set.add(integer);
        // System.out.println(set);

        // --------------------:) 2nd Approach
        set.addAll(list1);
        set.addAll(list2);
        // System.out.println(set);

        // -------------------:) 3rd Approach : Optimal Approach
        int s1 = list1.size();
        int s2 = list2.size();
        int i = 0;
        int j = 0;

        while (i < s1 && j < s2) {
            if (list1.get(i) <= list2.get(j)) {
                if (list1.size() == 0 || !list1.contains(list1.get(i))) {
                    union.add(list1.get(i));
                }
                i++;
            } else {
                if (list2.size() == 0 || !list2.contains(list2.get(j))) {
                    union.add(list2.get(i));
                }
                j++;
            }
        }
        while (i < s1) {
            if (list1.size() == 0 || !list1.contains(list1.get(i))) {
                union.add(list1.get(i));
            }
            i++;
        }
        while (j < s2) {
            if (list2.size() == 0 || !list2.contains(list2.get(j))) {
                union.add(list2.get(i));
            }
            j++;
        }
        System.out.println(union);
    }
}
