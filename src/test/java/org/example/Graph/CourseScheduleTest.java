package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    @Test
    public void testCanFinish_Example1() {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

    @Test
    public void testCanFinish_Example2() {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertFalse(result);
    }

    @Test
    public void testCanFinish_EmptyInput() {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 0;
        int[][] prerequisites = {};
        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

    @Test
    public void testCanFinish_CyclicDependency() {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 3;
        int[][] prerequisites = {{0, 1}, {1, 2}, {2, 0}};
        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertFalse(result);
    }

    @Test
    public void testCanFinish_NoPrerequisites() {
        CourseSchedule courseSchedule = new CourseSchedule();
        int numCourses = 4;
        int[][] prerequisites = {};
        boolean result = courseSchedule.canFinish(numCourses, prerequisites);
        assertTrue(result);
    }

}