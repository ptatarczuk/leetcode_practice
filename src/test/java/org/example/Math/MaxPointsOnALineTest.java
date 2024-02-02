package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPointsOnALineTest {
    @Test
    public void testExample1() {
        MaxPointsOnALine maxPointsOnALine = new MaxPointsOnALine();
        int[][] points1 = {{1,1},{2,2},{3,3}};
        int result1 = maxPointsOnALine.maxPoints(points1);
        assertEquals(3, result1);
    }

    @Test
    public void testExample2() {
        MaxPointsOnALine maxPointsOnALine = new MaxPointsOnALine();
        int[][] points2 = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int result2 = maxPointsOnALine.maxPoints(points2);
        assertEquals(4, result2);
    }
}