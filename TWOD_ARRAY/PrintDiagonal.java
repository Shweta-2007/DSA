package TWOD_ARRAY;

import java.util.ArrayList;

// print right diagonal of the given matrix
public class PrintDiagonal {
    public static ArrayList<Integer> diagonal(int arr[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int totalRows = arr.length;

        int i = 0;
        int j = 0;
        while (i < totalRows) {
            result.add(arr[i][j]);
            i++;
            j++;

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 5, 8, 7 }, { 2, 11, 3, 9 }, { 15, 20, -3, 60 }, { 30, 40, 50, 60 } };
        ArrayList<Integer> ans = diagonal(arr);
        System.out.println(ans);
    }
}
