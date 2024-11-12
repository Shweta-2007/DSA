package AdvanceDSA.HASHING;

import java.util.HashSet;

// Given an arr[N] and k. Check if there exists a pair(i,j) such that arr[i] + arr[j] == k && i != j.
public class PairExists {
    public static boolean exists(int arr[], int k) {
        HashSet<Integer> set = new HashSet<>();
        // creating hash set on the go
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(k - arr[i])) {
                return true;
            }
            set.add(arr[i]);
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
