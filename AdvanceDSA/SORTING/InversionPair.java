package AdvanceDSA.SORTING;

import java.util.Arrays;

// Given two arrays, A[n] and B[m], calculate number of pairs(i,j) such that A[i] > B[j].
public class InversionPair {
    public static int countPairs(int arr1[], int arr2[]) {
        int count = 0;
        int n = arr1.length;
        int m = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                i++;
            } else {
                count += (n - i);
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 5 }; // 3,5,7
        int arr2[] = { 2, 0, 6 }; // 0,2,6
        int ans = countPairs(arr1, arr2);
        System.out.println(ans);
    }
}
