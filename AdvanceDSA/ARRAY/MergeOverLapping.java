package AdvanceDSA.ARRAY;

import java.util.ArrayList;

// Given a sorted list of overlapping intervals, sorted based on strat-time, merge all overlapping intervals and return the sorted list of non-overlapping intervals.
public class MergeOverLapping {
    public static ArrayList<int[]> overlapping(int arr[][]) {
        ArrayList<int[]> list = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            // Check for overlapping condition
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                list.add(new int[] { start, end });
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        // Add the last interval
        list.add(new int[] { start, end });
        return list;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 1, 4 }, { 5, 6 }, { 6, 8 }, { 7, 10 }, { 8, 9 }, { 12, 14 } };
        ArrayList<int[]> ans = overlapping(arr);
        for (int[] interval : ans) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}