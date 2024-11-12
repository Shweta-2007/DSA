package AdvanceDSA.SORTING;

public class PivotPartition {
    public static void pivot(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int pivot = arr[0];
        while (left <= right) {
            if (arr[left] <= pivot) {
                left++;
            } else if (arr[right] > pivot) {
                right--;
            } else {
                // swap left and right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // swap arr[0] with arr[right]
        int temp = arr[0];
        arr[0] = arr[right];
        arr[right] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        pivot(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
