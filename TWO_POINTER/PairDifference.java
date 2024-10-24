package TWO_POINTER;

public class PairDifference {
    public static boolean isPresent(int arr[], int k) {
        int left = 0;
        int right = 1;
        while (right < arr.length) {
            if (arr[right] - arr[left] == k) {
                return true;
            }
            if (arr[right] - arr[left] < k) {
                right++;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 0, 1, 3, 6, 8, 11, 14, 18, 25 };
        int k = 5;
        boolean ans = isPresent(arr, k);
        System.out.println(ans);
    }
}
