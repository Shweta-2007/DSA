package AdvanceDSA.HASHING;

import java.util.HashMap;

// Given N elements. Find the first-non repeating element.
public class NonRepeating {
    public static int firstNonRepeating(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 3, 2, 5, 6, 4, 5 };
        int ans = firstNonRepeating(arr);
        System.out.println(ans);
    }
}
