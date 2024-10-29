package AdvanceDSA.ARRAY;

// method 1: find all subarrays then find max sum out of these, T.C => O(N ^ 3)
// method 2: kadane's algorithm => carry forward sum only if sum is positive
public class MaxSubarraySum {
    public static int maxSum(int arr[]) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -20, 30, 40, -10, 50, -100, 70 };
        int ans = maxSum(arr);
        System.out.println(ans);
    }
}
