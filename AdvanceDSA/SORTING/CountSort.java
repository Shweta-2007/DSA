package AdvanceDSA.SORTING;

import java.util.Arrays;

// Find the smallest number that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form of an array.
public class CountSort {
    public static int[] smallestNumber(int arr[]) {

        // create frequency array
        int farr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            farr[arr[i]]++;
        }
        int k = 0;

        for (int d = 0; d < farr.length; d++) {
            for (int i = 0; i < farr[d]; i++) {
                arr[k] = d;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 2, 7, 2, 1 };
        int ans[] = smallestNumber(arr);
        System.out.println(Arrays.toString(ans));
    }

}
