package AdvanceDSA.ARRAY;

import java.util.Arrays;

// Initailly all elements of array are 0, Then you are given Q queries. Every query contains index and value. Increment elements from ith-index to last index by value. Return final state of arr[]
// T.C => O(N * Q)
public class QuerySum {
    public static int[] findQuerySum(int arr[], int queries[][]) {

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            for (int j = index; j < arr.length; j++) {
                arr[j] += value;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        int queries[][] = { { 3, 4 }, { 1, 3 }, { 4, -2 } };
        int ans[] = findQuerySum(arr, queries);
        System.out.println(Arrays.toString(ans));
    }
}
