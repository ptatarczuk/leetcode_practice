package org.example.BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    @Test
    public void testSingleNumberExample1() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {2, 2, 1};
        int expected = 1;
        int result = singleNumber.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleNumberExample2() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int expected = 4;
        int result = singleNumber.singleNumber(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleNumberExample3() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {1};
        int expected = 1;
        int result = singleNumber.singleNumber(nums);
        assertEquals(expected, result);
    }


}