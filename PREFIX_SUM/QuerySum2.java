package PREFIX_SUM;

import java.util.ArrayList;

// Given an array of N integers and Q queries. For each query calculate sum of elements in the range - [L,R];
// T.C => O(Q + N)  S.C => O()
public class QuerySum2 {
    public static ArrayList<Integer> calculateSum(int arr[], int queries[][]) {
        ArrayList<Integer> result = new ArrayList<>();

        // create prefix sum array
        int pSum[] = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] += pSum[i - 1] + arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int L = queries[i][0];
            int R = queries[i][1];

            if (L == 0) {
                sum = pSum[R];
            } else {
                sum = pSum[R] - pSum[L - 1];
            }

            result.add(sum);
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int queries[][] = { { 4, 8 }, { 3, 7 }, { 1, 3 }, { 0, 4 }, { 7, 7 } };
        ArrayList<Integer> ans = calculateSum(arr, queries);
        System.out.println(ans);
    }
}
