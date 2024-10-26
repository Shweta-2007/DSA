package PREFIX_SUM;

import java.util.ArrayList;

// Given an array of N integers and Q queries. For each query calculate sum of elements in the range - [L,R];
// T.C => O(Q * N)  S.C => O(1)
public class QuerySum {
    public static ArrayList<Integer> calculateSum(int arr[], int queries[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int L = queries[i][0];
            int R = queries[i][1];
            for (int j = L; j <= R; j++) {
                sum += arr[j];
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
