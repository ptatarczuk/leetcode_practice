package org.example.Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {
    @Test
    public void testSetZeroesExample1() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroesExample2() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroesAllZeroes() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroesNoZeroes() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroesSingleRowZero() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{1, 2, 3, 4, 5}};
        int[][] expected = {{1, 2, 3, 4, 5}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroesSingleColumnZero() {
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
        int[][] expected = {{1}, {2}, {3}, {4}, {5}};
        setMatrixZeroes.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

}