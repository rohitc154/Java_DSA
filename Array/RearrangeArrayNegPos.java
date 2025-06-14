package Array;

import java.util.ArrayList;

public class RearrangeArrayNegPos {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 4, -3, 1 };
        int n = arr.length;

        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posList.add(arr[i]);
            } else {
                negList.add(arr[i]);
            }
        }
        // System.out.println(posList);
        // System.out.println(negList);

        if (posList.size() < negList.size()) {
            for (int i = 0; i < posList.size(); i++) {
                arr[2 * i] = posList.get(i);
                arr[2 * i + 1] = negList.get(i);
            }
            int rem = posList.size() * 2;
            int index = posList.size();

            for (int i = rem; i < n; i++) {
                arr[i] = negList.get(index);
                index++;
            }

        } else {
            for (int i = 0; i < negList.size(); i++) {
                arr[2 * i] = posList.get(i);
                arr[2 * i + 1] = negList.get(i);
            }
            int rem = negList.size() * 2;
            int index = negList.size();

            for (int i = rem; i < n; i++) {
                arr[i] = posList.get(index);
                index++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
