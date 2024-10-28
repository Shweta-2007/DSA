package SLIDING_WINDOW;

// Given an array. Find sum of all sub arrays sums. T.C => O(N ^ 3) S.C => 0(1)
public class SubarraySum {
    public static int sumOfAllSubArrays(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

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
