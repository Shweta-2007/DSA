package AdvanceDSA.HASHING;

import java.util.HashMap;

// count of sub arrays with sum = 0
public class CountSubarraySum {
    public static int count(int arr[]) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        prefixSumMap.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSumMap.containsKey(prefixSum)) {
                count += prefixSumMap.get(prefixSum);
            }
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
        int ans = count(arr);
        System.out.println(ans);
    }

}
