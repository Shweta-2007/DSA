package PREFIX_SUM;

// Given an arr[N], count the number of special indices in the array. special index: index after removing which, sum of even indexed elements = sum of odd indexed elements
public class SpecialIndex {
    public static int specialIndexCount(int arr[]) {
        int n = arr.length;
        int count = 0;
        // Create prefix sum arrays for even and odd indexed elements
        int pSumEven[] = new int[n];
        int pSumOdd[] = new int[n];
        pSumEven[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pSumEven[i] = pSumEven[i - 1] + arr[i];
            } else {
                pSumEven[i] = pSumEven[i - 1];
            }

        }

        pSumOdd[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                pSumOdd[i] = pSumOdd[i - 1] + arr[i];
            } else {
                pSumOdd[i] = pSumOdd[i - 1];
            }

        }

        if (pSumOdd[n - 1] - pSumOdd[0] == pSumEven[n - 1] - pSumEven[0]) {
            count++;
        }

        for (int i = 1; i < n; i++) {
            int evenIndexedSum = pSumEven[i - 1] + pSumOdd[n - 1] - pSumOdd[i];
            int oddIndexedSum = pSumOdd[i - 1] + pSumEven[n - 1] - pSumEven[i];

            if (evenIndexedSum == oddIndexedSum) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 6, -2 };
        int ans = specialIndexCount(arr);
        System.out.println(ans);
    }
}
