package TWO_POINTER;

public class PairSum {
    public static boolean isPresent(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                return true;
            }
            if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -5, -2, 1, 8, 10, 12, 15 };
        int k = 11;
        boolean ans = isPresent(arr, k);
        System.out.println(ans);
    }
}
