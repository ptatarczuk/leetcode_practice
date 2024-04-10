package org.example.Heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPOTest {
    private final IPO ipo = new IPO();

    @Test
    public void testFindMaximizedCapitalExample1() {
        assertEquals(4, ipo.findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{0,1,1}));
    }

    @Test
    public void testFindMaximizedCapitalExample2() {
        assertEquals(6, ipo.findMaximizedCapital(3, 0, new int[]{1,2,3}, new int[]{0,1,2}));
    }

    @Test
    public void testFindMaximizedCapitalNoProjectsStarted() {
        assertEquals(0, ipo.findMaximizedCapital(2, 0, new int[]{5,6,7}, new int[]{10,11,12}));
    }

    @Test
    public void testFindMaximizedCapitalKGreaterThanProjects() {
        assertEquals(6, ipo.findMaximizedCapital(10, 0, new int[]{1,2,3}, new int[]{0,1,1}));
    }
}