package SLIDING_WINDOW;

// Given array. Print maximum subarray sum of subarray with length k.           T.C => O(N ^ 2)
public class MaxSubarraySum {
    public static int maxSum(int arr[], int k) {
        int n = arr.length;
        int ans = 0;
        int startIndex = 0;
        int endIndex = k - 1;
        while (endIndex < n) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += arr[i];
            }
            ans = Math.max(ans, sum);
            startIndex++;
            endIndex++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int k = 5;
        int result = maxSum(arr, k);
        System.out.println(result);
    }
}
