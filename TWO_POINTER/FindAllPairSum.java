package TWO_POINTER;

// Find all the pairs in a sorted array whose sum is k.
public class FindAllPairSum {
    // Case 1: When elements are distinct
    public static int countAllPairs(int arr[], int k) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                count++;
                left++;
                right--;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    // Case 2: When elements are repeating (duplicates)

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        int k = 10;
        int ans = countAllPairs(arr, k);
        System.out.println(ans);
    }

}
