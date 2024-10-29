package TWOD_ARRAY;

import java.util.Arrays;

public class Rotate90Degree {
    public static int[][] rotate(int arr[][]) {
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        // step 1: transpose
        for (int i = 0; i < totalRows; i++) {
            for (int j = i + 1; j < totalCols; j++) {
                // swap elements
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2: reverse the element of every row
        for (int i = 0; i < totalRows; i++) {
            reverse(arr[i]);
        }

        return arr;
    }

    // helper function: reverse
    public static void reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int ans[][] = rotate(arr);
        System.out.println(Arrays.deepToString(ans));

    }
}
