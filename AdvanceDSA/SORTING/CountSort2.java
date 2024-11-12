package AdvanceDSA.SORTING;

import java.util.Arrays;

// Negative numbers are also included
// Find the smallest number that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form of an array.
public class CountSort2 {
    public static int[] smallestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        int range = max - min + 1;

        // create frequency array
        int farr[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i] - min]++;
        }
        int k = 0;
        for (int d = min; d < max; d++) {
            for (int i = 0; i < farr[d - min]; i++) {
                arr[k] = d;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 3, 8, 3, -2, 3 };
        int ans[] = smallestNumber(arr);
        System.out.println(Arrays.toString(ans));
    }

}
