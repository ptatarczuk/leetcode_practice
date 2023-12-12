package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesAndLaddersTest {
    @Test
    public void testExample1() {
        SnakesAndLadders game = new SnakesAndLadders();
        int[][] board = {
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,35,-1,-1,13,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,15,-1,-1,-1,-1}
        };
        int result = game.snakesAndLadders(board);
        assertEquals(4, result);
    }

    @Test
    public void testExample2() {
        SnakesAndLadders game = new SnakesAndLadders();
        int[][] board = {
                {-1,-1},
                {-1,3}
        };
        int result = game.snakesAndLadders(board);
        assertEquals(1, result);
    }

}