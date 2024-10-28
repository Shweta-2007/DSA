package SUB_ARRAYS;

// Given an array of N integers, return the length of smallest subarray which contains both maximum and minimun, T.C => 0(N) S.C => 0(1)
public class MinMax {
    public static int findLength(int arr[]) {
        int n = arr.length;
        int length = n;
        int minIndex = -1;
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    length = Math.min(length, i - minIndex + 1);
                }
            } else if (arr[i] == min) {
                minIndex = i;
                if (maxIndex != -1) {
                    length = Math.min(length, i - maxIndex + 1);
                }
            }

        }

        return length;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
        int ans = findLength(arr);
        System.out.println(ans);
    }
}
