package AdvanceDSA.ARRAY;

public class FirstMissingNaturalNumber {
    public static void main(String[] args) {
        int arr[] = { 9, 2, 6, 4, -8, 1, 3 };
        int missingNumber = findFirstMissingNaturalNumber(arr);
        System.out.println("The first missing natural number is: " + missingNumber);
    }

    public static int findFirstMissingNaturalNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = n + 2;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val <= n) {
                arr[val - 1] = -1 * Math.abs(arr[val - 1]);
            }
        }

        // Find the first positive value's index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all positions are marked, the missing number is n + 1
        return n + 1;
    }
}
