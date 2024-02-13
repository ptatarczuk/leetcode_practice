package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testMinimumTotalExample1() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        Triangle t = new Triangle();
        int result = t.minimumTotal(triangle);

        assertEquals(11, result, "Minimum total for Example 1 should be 11");
    }

    @Test
    public void testMinimumTotalExample2() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-10));

        Triangle t = new Triangle();
        int result = t.minimumTotal(triangle);

        assertEquals(-10, result, "Minimum total for Example 2 should be -10");
    }
}

