public class MatrixRotate01 {
    static void rotateArr(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] solArr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                solArr[j][row-i-1] = arr[i][j];
        }

        // printing of the array ...
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(solArr[i][j]+"  ");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]+"  ");
            System.out.println();
        }
        rotateArr(arr);
    }
}
