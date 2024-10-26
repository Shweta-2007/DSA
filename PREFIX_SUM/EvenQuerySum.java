package PREFIX_SUM;

import java.util.ArrayList;

// Given an arr[N] and Q queries with start(s) and end(e) index. For every query print sum of all even indexed elements from s to e
public class EvenQuerySum {
    public static ArrayList<Integer> calculateSum(int arr[], int queries[][]) {
        ArrayList<Integer> result = new ArrayList<>();

        // create prefix sum array for even indexed element only
        int pSum[] = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSum[i] += pSum[i - 1] + arr[i];
            } else {
                pSum[i] = pSum[i - 1];
            }

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
        int arr[] = { 2, 3, 1, 6, 4, 5 };
        int queries[][] = { { 1, 3 }, { 2, 5 }, { 0, 4 }, { 3, 3 } };
        ArrayList<Integer> ans = calculateSum(arr, queries);
        System.out.println(ans);
    }
}
