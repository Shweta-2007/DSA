package TWOD_ARRAY;

import java.util.Arrays;

// Transpose of a matrix => row becomes column and column becomes row,          T.C => O(N ^ 2) S.C => 0(1)

public class TransposeMatrix {
    public static int[][] transpose(int arr[][]) {

        int totalRows = arr.length;
        int totalCols = arr[0].length;
        for (int i = 0; i < totalRows; i++) {
            for (int j = i + 1; j < totalCols; j++) {
                // swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] ans = transpose(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}
