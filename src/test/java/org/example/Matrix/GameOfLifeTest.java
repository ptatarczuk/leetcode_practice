package org.example.Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {
    @Test
    public void testGameOfLifeExample1() {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};

        gameOfLife.gameOfLife(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLifeExample2() {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = {{1, 1}, {1, 0}};
        int[][] expected = {{1, 1}, {1, 1}};

        gameOfLife.gameOfLife(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLifeEmptyBoard() {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = {};
        int[][] expected = {};

        gameOfLife.gameOfLife(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLifeNullBoard() {
        GameOfLife gameOfLife = new GameOfLife();
        int[][] board = null;

        gameOfLife.gameOfLife(board);

        assertArrayEquals(null, board);
    }

}