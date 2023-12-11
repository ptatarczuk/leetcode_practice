package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseSchedule2Test {
    @Test
    void testExample1() {
        CourseSchedule2 courseSchedule = new CourseSchedule2();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] expected = {0, 1};
        int[] result = courseSchedule.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    void testExample2() {
        CourseSchedule2 courseSchedule = new CourseSchedule2();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expected = {0, 2, 1, 3};
        int[] result = courseSchedule.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

    @Test
    void testExample3() {
        CourseSchedule2 courseSchedule = new CourseSchedule2();
        int numCourses = 1;
        int[][] prerequisites = {};
        int[] expected = {0};
        int[] result = courseSchedule.findOrder(numCourses, prerequisites);
        assertArrayEquals(expected, result);
    }

}