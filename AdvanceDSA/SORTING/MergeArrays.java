package AdvanceDSA.SORTING;

import java.util.Arrays;

// Merge two sorted arrays
public class MergeArrays {
    public static int[] merge(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int result[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 7, 8, 12 };
        int arr2[] = { 3, 5, 6, 7 };
        int ans[] = merge(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
