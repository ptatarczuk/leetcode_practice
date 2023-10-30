package org.example.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        long[][] points1 = new long[points.length][];
        int j = 0;
        for (int[] y : points) {
            points1[j] = new long[2];
            points1[j][0] = y[0];
            points1[j][1] = y[1];
            j++;
        }

        Arrays.sort(points1, new Comparator<long[]>() {
            public int compare(long[] p, long[] q) {
                return p[1] > q[1] ? 1 : -1;
            }
        });

        long end = points1[0][1];
        int count = 1;
        int i = 1;
        while (i < points1.length) {
            System.out.println("points[" + i + "][0]::" + points1[i][0] + "::end::" + end);
            if (points1[i][0] > end) {
                end = points1[i][1];
                count++;
            }
            i++;
        }
        return count;
    }
}
