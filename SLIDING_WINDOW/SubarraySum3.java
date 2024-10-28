package SLIDING_WINDOW;

// Given an array. Find sum of all sub arrays sums. T.C => O(N) S.C => 0(1), contrbution technique
public class SubarraySum3 {
    public static int sumOfAllSubArrays(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr[i] * (i + 1) * (n - i);

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int result = sumOfAllSubArrays(arr);
        System.out.println(result);
    }
}
