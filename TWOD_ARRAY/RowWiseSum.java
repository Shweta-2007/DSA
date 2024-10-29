package TWOD_ARRAY;

import java.util.ArrayList;

public class RowWiseSum {
    public static ArrayList<Integer> rowSum(int arr[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        for (int i = 0; i < totalRows; i++) {
            int sum = 0;
            for (int j = 0; j < totalCols; j++) {
                sum += arr[i][j];

            }
            result.add(sum);

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 2, 7, 3 }, { 9, 5, -1, 8 }, { 3, 11, 15, 20 } };
        ArrayList<Integer> ans = rowSum(arr);
        System.out.println(ans);
    }
}
