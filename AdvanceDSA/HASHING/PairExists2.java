package AdvanceDSA.HASHING;

import java.util.HashMap;

public class PairExists2 {
    public static boolean exists(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // creating frequency map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                if (arr[i] != k - arr[i]) {
                    return true;
                } else if (map.get(arr[i]) >= 2) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 1, -2, 4, 5, 11, -6, 4 };
        int k = 22;
        boolean ans = exists(arr, k);
        System.out.println(ans);
    }
}
