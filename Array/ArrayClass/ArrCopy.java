package Array.ArrayClass;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr1 = { 12, 32, 85, 62, 36 };
        int[] arr2 = new int[arr1.length];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int i : arr2)
            System.out.print(i + "  ");
    }
}