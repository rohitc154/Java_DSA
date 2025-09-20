package Array;

public class SetMatrix02 {
    public static void main(String[] args) {

        int binArr[][] = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 1, 0, 0, 1 } };
        int row = binArr[0].length;
        int col = binArr.length;

        int rowArr[] = new int[row];
        int colArr[] = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (binArr[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowArr[i] == 1 || colArr[j] == 1) {
                    binArr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(binArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
