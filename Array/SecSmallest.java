package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SecSmallest {

    static int secSmall(ArrayList<Integer> list) {
        int smallest = list.get(0);
        int secSmallest = Integer.MAX_VALUE;

        for (Integer val : list) {
            if (val < smallest) {
                secSmallest = smallest;
                smallest = val;
            } else if (val != smallest && val < secSmallest) {
                secSmallest = val;
            }
        }
        return secSmallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter no. of values : ");
        int n = input.nextInt();

        System.out.println("Enter Values : ");
        for (int i = 0; i < n; i++)
            list.add(input.nextInt());

        int secSmallest = secSmall(list);
        System.out.println("Second Smallest Value :" + secSmallest);
        input.close();
    }
}
