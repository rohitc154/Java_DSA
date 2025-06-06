package Array;

// Moving Zeros of the array at the end, maintaing the order of the element.
public class MoveZerosAtEnd {

    // Brute Force Approach

    // public static void main(String[] args) {
    // int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
    // int temp[] = new int[arr.length];

    // int j = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // temp[j] = arr[i];
    // j += 1;
    // }
    // }
    // for (int i : temp)
    // System.out.print(i + " ");
    // }

    // Optimal Approach
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}