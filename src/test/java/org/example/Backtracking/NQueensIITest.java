package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NQueensIITest {

    @Test
    public void testTotalNQueens_4Queens() {
        NQueensII nQueens = new NQueensII();
        int result = nQueens.totalNQueens(4);
        assertEquals(2, result);
    }

    @Test
    public void testTotalNQueens_1Queen() {
        NQueensII nQueens = new NQueensII();
        int result = nQueens.totalNQueens(1);
        assertEquals(1, result);
    }

}