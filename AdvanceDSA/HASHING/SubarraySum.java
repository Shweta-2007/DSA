package AdvanceDSA.HASHING;

import java.util.HashMap;

// Given an array of N elements. Check if there exists a subarray with sum equal to 0.
public class SubarraySum {
    public static boolean exists(int arr[]) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0 || prefixSumMap.containsKey(prefixSum)) {
                return true;
            } else {
                prefixSumMap.put(prefixSum, i);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
        boolean ans = exists(arr);
        System.out.println(ans);
    }

}
