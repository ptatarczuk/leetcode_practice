package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest{
    @Test
    public void testCanCompleteCircuitExample1() {
        GasStation solution = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        int result = solution.canCompleteCircuit(gas, cost);
        assertEquals(expected, result);
    }

    @Test
    public void testCanCompleteCircuitExample2() {
        GasStation solution = new GasStation();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int expected = -1;
        int result = solution.canCompleteCircuit(gas, cost);
        assertEquals(expected, result);
    }
}