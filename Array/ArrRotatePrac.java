package Array;

public class ArrRotatePrac {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 4, 5, 6, 7 };
        int k = 3;
        int x = k;
        for (int i = 0; i < arr.length; i++) {
            if (i <= k/2) {
                int temp = arr[i];
                arr[i] = arr[x - 1];
                arr[x - 1] = temp;
                x--;
            }
        }
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
