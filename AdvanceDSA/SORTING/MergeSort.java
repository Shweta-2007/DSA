package AdvanceDSA.SORTING;

public class MergeSort {
    public static void merge(int arr[], int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        merge(arr, low, mid);
        merge(arr, mid + 1, high);
        merge2SortedArrays(arr, low, mid, high);
    }

    public static void merge2SortedArrays(int arr[], int low, int mid, int high) {
        int ans[] = new int[high - low + 1];

        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;

            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            ans[k] = arr[i];
            k++;
            i++;
        }

        while (j <= high) {
            ans[k] = arr[j];
            k++;
            j++;
        }

        // copy all the elements from ans to arr[]
        for (int l = 0; l < ans.length; l++) {
            arr[low + l] = ans[l];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 10, 6, 8, 15, 2, 12, 18, 17 };
        merge(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
