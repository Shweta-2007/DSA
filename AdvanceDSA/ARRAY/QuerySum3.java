package AdvanceDSA.ARRAY;

import java.util.Arrays;

// Initailly all elements of array are 0, Then you are given Q queries. Every query contains start index, end index and value. Increment elements from start index to end index by value. Return final state of arr[] => Google asked question
//  T.C => O(N * Q)
public class QuerySum3 {
    public static int[] findQuerySum(int arr[], int queries[][]) {
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int value = queries[i][2];
            for (int j = startIndex; j <= endIndex; j++) {
                arr[j] += value;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int queries[][] = { { 3, 6, 3 }, { 2, 7, -3 }, { 1, 9, 4 } };
        int ans[] = findQuerySum(arr, queries);
        System.out.println(Arrays.toString(ans));
    }
}
