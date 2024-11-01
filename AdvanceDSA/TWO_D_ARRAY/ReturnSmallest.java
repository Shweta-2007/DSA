package AdvanceDSA.TWO_D_ARRAY;

// return smallest value of i + 1009 * j
// for this to be smallest, j should be minimum
public class ReturnSmallest {
    public static int smallestValue(int arr[][], int target) {
        int ans = Integer.MAX_VALUE;
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        // start from top right
        int i = 0;
        int j = totalCols - 1;
        while (i < totalRows && j >= 0) {
            if (arr[i][j] == target) {
                int value = i + 1009 * j;
                ans = Math.min(ans, value);
                j--;

            } else if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[][] = { { -5, 2, 0, 7, 8 }, { 0, 2, 5, 10, 20 }, { 3, 15, 15, 15, 21 }, { 4, 15, 20, 30, 40 } };
        int target = 15;
        int result = smallestValue(arr, target);
        System.out.println(result);
    }
}
