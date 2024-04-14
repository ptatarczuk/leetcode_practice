package org.example.Heap;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {
    private FindMedianFromDataStream medianFinder;

    @Before
    public void setUp() {
        medianFinder = new FindMedianFromDataStream();
    }

    @Test
    public void testExample1() {
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian(), 0.001);
    }

    @Test
    public void testRandomInput() {
        medianFinder.addNum(5);
        assertEquals(5.0, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(2);
        assertEquals(3.5, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(7);
        assertEquals(5.0, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(3);
        assertEquals(4.0, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(6);
        assertEquals(5.0, medianFinder.findMedian(), 0.001);
    }

    @Test
    public void testEdgeCases() {
        medianFinder.addNum(-105);
        assertEquals(-105.0, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(105);
        assertEquals(0.0, medianFinder.findMedian(), 0.001);
        medianFinder.addNum(0);
        assertEquals(0.0, medianFinder.findMedian(), 0.001);
    }
}