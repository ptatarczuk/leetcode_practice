package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {
    @Test
    public void testSolveExample1() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        SurroundedRegions surroundedRegions = new SurroundedRegions();
        surroundedRegions.solve(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void testSolveExample2() {
        char[][] board = {{'X'}};
        char[][] expected = {{'X'}};

        SurroundedRegions surroundedRegions = new SurroundedRegions();
        surroundedRegions.solve(board);

        assertArrayEquals(expected, board);
    }

}