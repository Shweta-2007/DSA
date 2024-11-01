package AdvanceDSA.TWO_D_ARRAY;

public class SubMatrixSum {
    public static int sum(int arr[][]) {
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans += arr[i][j] * (i + 1) * (j + 1) * (arr.length - i) * (arr[0].length - j);
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 9, 6 }, { 5, -1, 2 } };
        int ans = sum(arr);
        System.out.println(ans);
    }
}
