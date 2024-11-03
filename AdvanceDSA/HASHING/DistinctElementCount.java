package AdvanceDSA.HASHING;

import java.util.HashSet;

// Count of distinct elements
public class DistinctElementCount {
    public static int count(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2 };
        int ans = count(arr);
        System.out.println(ans);
    }
}
