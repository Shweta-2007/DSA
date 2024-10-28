package SLIDING_WINDOW;

// Given an array. Find sum of all sub arrays sums. T.C => O(N ^ 2) S.C => 0(1)
public class SubarraySum2 {
    public static int sumOfAllSubArrays(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                ans += sum;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int result = sumOfAllSubArrays(arr);
        System.out.println(result);
    }
}
