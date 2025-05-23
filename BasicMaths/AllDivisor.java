import java.util.ArrayList;
import java.util.Collections;

public class AllDivisor {
    static void allDivisor(int val) {
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        // while (i <= (int) Math.sqrt(val)) { //Iterating till Square root of the val and this loop can also be written as : -|
        while (i * i <= val) {
            if (val % i == 0) {
                // System.out.println(i);
                list.add(i);
                if ((val / i) != i) {
                    // System.out.println(val / i);
                    list.add(val / i);
                }
            }
            i++;
        }
        Collections.sort(list);
        System.out.println(list);

    }

    public static void main(String[] args) {
        allDivisor(36);
    }
}
