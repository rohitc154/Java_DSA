package Array;

public class ReverseImage {
    public static void rotate(int[][] matrix) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i <= matrix.length / 2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp1 = matrix[i][j];
                // temp2 = matrix[2 - j][i];
                temp2 = matrix[i][2 - j];
                matrix[i][j] = matrix[i][2 - j];
                matrix[2 - j][i] = matrix[j][i];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + "  ");
            System.out.println();
        }

        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + "  ");
            System.out.println();
        }
    }
}
