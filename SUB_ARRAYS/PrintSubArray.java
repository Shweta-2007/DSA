package SUB_ARRAYS;

import java.util.ArrayList;

// print all possible subarrays of the given array
// T.C => O(N ^ 3), S.C => O(N)
public class PrintSubArray {
    public static void printAllSubArrays(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> result = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    result.add(arr[k]);
                }
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 10, 3, 12, -2, 15 };
        printAllSubArrays(arr);

    }
}
