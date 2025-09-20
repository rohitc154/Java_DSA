package Array;

public class LongestSequence {
    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                boolean isAvail = false;
                temp += 1;
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if (temp == arr[j2]) {
                        count++;
                    }
                }
            }
            System.out.println(count + " -- ");
            if (maxCount < count) {
                maxCount = count;
            }
            count = 0;
        }
        System.out.println(maxCount);
    }
}
