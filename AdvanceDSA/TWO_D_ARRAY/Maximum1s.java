package AdvanceDSA.TWO_D_ARRAY;

// Given a binary sorted matrix A of size N * N. Find the row with the maximum number of 1's [only rows are sorted]
// T.C => 0(N + M)
public class Maximum1s {
    public static int rowNumber(int arr[][]) {
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int row = 0;

        // start from top right
        int i = 0;
        int j = totalCols - 1;
        while (i < totalRows && j >= 0) {
            if (arr[i][j] == 1) {
                row = i;
                j--;
            } else {
                i++;
            }
        }

        return row;

    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 } };
        int ans = rowNumber(arr);
        System.out.println(ans);
    }
}
