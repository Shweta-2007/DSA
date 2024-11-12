package AdvanceDSA.HASHING;

import java.util.ArrayList;
import java.util.HashMap;

// Count of distinct elements in every window of size B
public class DistinctElementCount2 {
    public static ArrayList<Integer> count(int arr[], int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // creating the window of size B
        for (int i = 0; i < B; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());

        // slide the window
        for (int i = B; i < arr.length; i++) {
            // Remove the element going out of the window
            int elementToRemove = arr[i - B];
            if (map.get(elementToRemove) == 1) {
                map.remove(elementToRemove);
            } else {
                map.put(elementToRemove, map.get(elementToRemove) - 1);
            }

            // Add the new element into the window
            int elementToAdd = arr[i];
            map.put(elementToAdd, map.getOrDefault(elementToAdd, 0) + 1);
            result.add(map.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 2, 1 };
        int B = 3;
        ArrayList<Integer> ans = count(arr, B);
        System.out.println(ans);
    }
}
