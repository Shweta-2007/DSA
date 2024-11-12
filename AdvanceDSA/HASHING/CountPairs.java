package AdvanceDSA.HASHING;

import java.util.HashMap;

public class CountPairs {
    public static int count(int arr[], int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                count += map.get(k - arr[i]);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 5, 8, 5, 2, 8 };
        int k = 10;
        int ans = count(arr, k);
        System.out.println(ans);
    }
}
