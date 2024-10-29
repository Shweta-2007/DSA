package AdvanceDSA.ARRAY;

// Given arr[N], where arr[i] -> height of building. Return amount of water trapped on all the buildings. IDEA: Build left max and right max array first. T.C => O(N)
public class RainWaterTrapping2 {
    public static int amountOfRainWater(int arr[]) {
        int totalAmount = 0;
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            totalAmount += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
        int ans = amountOfRainWater(arr);
        System.out.println("ans:" + ans);

    }
}
