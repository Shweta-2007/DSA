package AdvanceDSA.ARRAY;

// Given arr[N], where arr[i] -> height of building. Return amount of water trapped on all the buildings T.C => O(N ^ 2)
public class RainWaterTrapping {
    public static int amountOfRainWater(int arr[]) {
        int totalAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxLeft = Integer.MIN_VALUE;
            int maxRight = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, arr[j]);
            }
            for (int j = i; j < arr.length; j++) {
                maxRight = Math.max(maxRight, arr[j]);
            }

            totalAmount += (Math.min(maxRight, maxLeft) - arr[i]);

        }
        return totalAmount;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
        int ans = amountOfRainWater(arr);
        System.out.println("ans:" + ans);

    }
}
