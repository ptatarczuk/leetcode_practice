package org.example.OneD_DP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {
    @Test
    public void testExample1() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {1, 2, 3, 1};
        int expected = 4;
        int result = houseRobber.rob(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        int expected = 12;
        int result = houseRobber.rob(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {};
        int expected = 0;
        int result = houseRobber.rob(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleHouse() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {5};
        int expected = 5;
        int result = houseRobber.rob(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testAdjacentHouses() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 9; // Rob house 2 and house 4
        int result = houseRobber.rob(nums);
        assertEquals(expected, result);
    }
}