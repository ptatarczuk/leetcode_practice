package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSquareTest {
    @Test
    void testMaximalSquareExample1() {
        MaximumSquare maximumSquare = new MaximumSquare();
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, maximumSquare.maximalSquare(matrix));
    }

    @Test
    void testMaximalSquareExample2() {
        MaximumSquare maximumSquare = new MaximumSquare();
        char[][] matrix = {
                {'0', '1'},
                {'1', '0'}
        };
        assertEquals(1, maximumSquare.maximalSquare(matrix));
    }

    @Test
    void testMaximalSquareExample3() {
        MaximumSquare maximumSquare = new MaximumSquare();
        char[][] matrix = {
                {'0'}
        };
        assertEquals(0, maximumSquare.maximalSquare(matrix));
    }

    @Test
    void testMaximalSquareEmptyMatrix() {
        MaximumSquare maximumSquare = new MaximumSquare();
        char[][] matrix = {};
        assertEquals(0, maximumSquare.maximalSquare(matrix));
    }

    @Test
    void testMaximalSquareNullMatrix() {
        MaximumSquare maximumSquare = new MaximumSquare();
        assertEquals(0, maximumSquare.maximalSquare(null));
    }

}