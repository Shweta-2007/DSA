package TWOD_ARRAY;

// Given a matrix. Print all the elements diagonally from right to left

public class DiagonalRightToLeft {
    public static void diagonal(int arr[][]) {
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        // print all the diagonals starting from 0th row
        for (int col = 0; col < totalCols; col++) {
            int i = 0;
            int j = col;
            while (i < totalRows && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;

            }
            System.out.println();
        }
        // print all the diagonals starting last column
        for (int row = 1; row < totalRows; row++) {
            int i = row;
            int j = totalCols - 1;
            while (i < totalRows && j >= 0) {
                System.out.print(arr[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
        // output =>
        // 1
        // 2 6
        // 3 7 11
        // 4 8 12 16
        // 5 9 13 17
        // 10 14 18
        // 15 19
        // 20
        diagonal(arr);

    }
}
