package org.example.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {
    @Test
    public void testSearchMatrix_TargetExists_ReturnsTrue() {
        SearchA2DMatrix solution = new SearchA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix_TargetDoesNotExist_ReturnsFalse() {
        SearchA2DMatrix solution = new SearchA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix_TargetInFirstRow_ReturnsTrue() {
        SearchA2DMatrix solution = new SearchA2DMatrix();
        int[][] matrix = {{1, 2, 3, 4, 5}};
        int target = 3;
        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testSearchMatrix_TargetInLastRow_ReturnsTrue() {
        SearchA2DMatrix solution = new SearchA2DMatrix();
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int target = 13;
        assertTrue(solution.searchMatrix(matrix, target));
    }

}