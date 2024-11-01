package AdvanceDSA.TWO_D_ARRAY;

import java.util.ArrayList;

public class BoundaryElements {
    public static ArrayList<Integer> printBoundaryElements(int arr[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        int j = 0;

        for (int k = 1; k < n; k++) {
            result.add(arr[i][j]);
            j++;
        }

        for (int k = 1; k < n; k++) {
            result.add(arr[i][j]);
            i++;
        }

        for (int k = 1; k < n; k++) {
            result.add(arr[i][j]);
            j--;
        }

        for (int k = 1; k < n; k++) {
            result.add(arr[i][j]);
            i--;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        ArrayList<Integer> ans = printBoundaryElements(arr);
        System.out.println(ans);
    }
}
