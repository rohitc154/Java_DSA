package Array;

public class LongConsSeq {
    static boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr, x + 1) == true) {
                x += 1;
                count += 1;
            }
        }
        System.out.println("Longest Sequence is : " + longest);
    }
}
