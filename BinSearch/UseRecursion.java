package BinSearch;

public class UseRecursion {
    static int recuSearch(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            recuSearch(arr, mid + 1, end, target);
        }
        return recuSearch(arr, start, mid - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int result = recuSearch(arr, 0, (arr.length - 1), 9);
        System.out.println(result);
    }
}
