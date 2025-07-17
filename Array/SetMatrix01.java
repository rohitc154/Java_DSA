package Array;

public class SetMatrix01 {

    // Marking Row of the matrix as -1
    static void markRow(int[][] binArr, int i) {
        for (int j = 0; j < binArr.length; j++) {
            if (binArr[i][j] != 0) {
                binArr[i][j] = -1;
            }
        }
    }

    // Marking Column of the matrix as -1
    static void markCol(int[][] binArr, int j) {
        for (int i = 0; i < binArr.length; i++) {
            if (binArr[i][j] != 0) {
                binArr[i][j] = -1;
            }
        }
    }

    // Mark all -1 element to 0 of the matrix
    static void markZero(int[][] binArr) {
        for (int i = 0; i < binArr[0].length; i++) {
            for (int j = 0; j < binArr.length; j++) {
                if (binArr[i][j] == -1) {
                    binArr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int binArr[][] = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
        int row = binArr[0].length;
        int col = binArr.length;

        // for (int i = 0; i < binArr.length; i++) {
        //     for (int j = 0; j < binArr.length; j++) {
        //         System.out.print(binArr[i][j] + "  ");
        //     }
        //     System.out.println("");
        // }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (binArr[i][j] == 0) {
                    markCol(binArr, j);
                    markRow(binArr, i);
                }
            }
        }

        markZero(binArr);
        for (int i = 0; i < binArr.length; i++) {
            for (int j = 0; j < binArr.length; j++) {
                System.out.print(binArr[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
