package AdvanceDSA.TWO_D_ARRAY;

// Search in row-wise & column-wise sorted 2D array
// T.C => O(M + N)
public class SearchInSortedArray {
    public static boolean search(int arr[][], int target) {

        int totalRows = arr.length;
        int totalCols = arr[0].length;

        // start from top right
        int i = 0;
        int j = totalCols - 1;
        while (i < totalRows && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { -5, -2, 1, 13 }, { -4, 0, 3, 14 }, { -3, 2, 5, 18 }, { 2, 6, 10, 20 } };
        int target = 6;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }
}
