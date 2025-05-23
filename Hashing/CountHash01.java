package Hashing;

public class CountHash01 {

    static void hashFunc(int[] arr) {
        int hashArr[] = new int[13]; // Maximum value stored in the array is 12. So we require index 12

        for (int j = 0; j < arr.length; j++) {
            int temp = arr[j];
            ++hashArr[temp];
        }
        for (int j = 0; j < hashArr.length; j++) {
            System.out.print(hashArr[j] + "  ");
        }
    } 

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 2, 7, 1, 4, 4, 7, 12 };
        hashFunc(arr);
    }
}
