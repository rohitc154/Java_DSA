package Array;

public class LeftRotateByN {
    // public static void main(String[] args) {

    // // Method 1: ) - Brute Force Technique....

    // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    // int n = 3;
    // int temp[] = new int[n];
    // for (int i = 0; i < n; i++)
    // temp[i] = arr[i];

    // for (int i = 0; i < arr.length - n; i++) {
    // arr[i] = arr[n + i];
    // }
    // // int j = 0;
    // for (int i = arr.length - 3; i < arr.length; i++) {
    // arr[i] = temp[i - (arr.length - n)];
    // // j++;
    // }
    // for (int i : arr)
    // System.out.print(i + " ");
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        int len = arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, len - 1);
        reverse(arr, 0, len - 1);

        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}
