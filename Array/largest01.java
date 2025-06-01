package Array;

public class largest01 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 2 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Largest value is : " + max);
    }
}
