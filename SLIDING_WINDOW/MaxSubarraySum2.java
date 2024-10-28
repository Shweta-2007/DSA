package SLIDING_WINDOW;

// Given array. Print maximum subarray sum of subarray with length k.     Sliding window technique          T.C => O(N)
public class MaxSubarraySum2 {
    public static int maxSum(int arr[], int k) {
        int n = arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        // int ans = Integer.;

        // create window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        ans = sum;

        // slide the window
        int startIndex = 1;
        int endIndex = k;
        while (endIndex < n) {
            sum = sum - arr[startIndex - 1] + arr[endIndex];
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
