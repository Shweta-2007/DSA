package AdvanceDSA.HASHING;

import java.util.HashMap;

// Given N elements and Q queries. Find the frequency of elements provided in the query
public class Frequency {
    public static HashMap<Integer, Integer> frequency(int arr[], int queries[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> result = new HashMap<>();
        // creating frequency map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int query : queries) {
            result.put(query, map.getOrDefault(query, 0));
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int queries[] = { 2, 8, 3, 5, 90 };
        HashMap<Integer, Integer> result = frequency(arr, queries);
        System.out.println(result);
    }
}
