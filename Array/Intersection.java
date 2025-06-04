package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();
        l1.addAll(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6));
        l2.addAll(Arrays.asList(2, 3, 3, 5, 6, 6, 7));

        int s1 = l1.size();
        int s2 = l1.size();

        int i = 0;
        int j = 0;
        while (i < s1 && j < s2) {
            if (l1.get(i) < l2.get(j)) {
                i++;
            } else if (l1.get(i) > l2.get(j)) {
                j++;
            } else {
                intersect.add(l1.get(i));
                i++;
                j++;
            }
        }
        System.out.println(intersect);
    }
}
