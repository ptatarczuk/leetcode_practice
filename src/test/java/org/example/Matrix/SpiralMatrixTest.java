package org.example.Matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    @Test
    void testSpiralOrderExample1() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        assertIterableEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), result);
    }

    @Test
    void testSpiralOrderExample2() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        assertIterableEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), result);
    }

    @Test
    void testSpiralOrderEmptyMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {};
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSpiralOrderNullMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = null;
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        assertTrue(result.isEmpty());
    }

}