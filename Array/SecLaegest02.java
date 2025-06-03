package Array;

//Assuming there is no negative no. in array

public class SecLaegest02 {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 7, 4, 9, 8, 5, 8, 9, 9 };

        // Brute force solution : Sort the array and return (n-2) element, but check for
        // (n-i) and (n-i-1) are same or not

        // sort(arr);
        // int n = arr.length;
        // for (int i = n - 1; i > 0; i--) {
        // if (arr[i] != arr[i - 1]) {
        // System.out.println("Second Largest Number : " + arr[i - 1]);
        // break;
        // }
        // }

        // 2nd Way :) -> first find largest and put secLargest as -1 and then, keep
        // traversing :( Better Approach)

        // int largest = arr[0];
        // int secLargest = -1;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > largest)
        // largest = arr[i];
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > secLargest && arr[i] != largest)
        // secLargest = arr[i];
        // }
        // System.out.println("Second Largest Number : " + secLargest);

        // 3rd Way :)-> Optimal Approach
        int largest = 1;
        int secLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println("Second Largest : " + secLargest);
    }
}
