package AdvanceDSA.ARRAY;

import java.util.ArrayList;

// Given N non-overlapping intervals sorted based on start-time. Given a new interval. Merge this with existing intervals, if possible and return final non-overlapping intervals.
public class NonOverLapping {
    public static int[][] mergeIntervals(int intervals[][], int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        boolean newIntervalAdded = false;

        for (int i = 0; i < intervals.length; i++) {
            // if current interval ends before starting of new interval starts
            if (intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
            }

            // if current interval starts after new interval ends
            else if (intervals[i][0] > newInterval[1]) {
                if (!newIntervalAdded) {
                    result.add(newInterval);
                    newIntervalAdded = true;
                }
                result.add(intervals[i]);
            } else {
                // overlapping condition
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!newIntervalAdded) {
            result.add(newInterval);
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] mergedIntervals = mergeIntervals(intervals, newInterval);
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
