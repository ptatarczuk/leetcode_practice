package org.example.Graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionTest {
    @Test
    void testExample1() {
        EvaluateDivision evaluateDivision = new EvaluateDivision();
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("b", "a"),
                Arrays.asList("a", "e"), Arrays.asList("a", "a"),
                Arrays.asList("x", "x"));
        double[] expected = {6.0, 0.5, -1.0, 1.0, -1.0};
        double[] result = evaluateDivision.calcEquation(equations, values, queries);
        assertArrayEquals(expected, result, 0.00001);
    }

    @Test
    void testExample2() {
        EvaluateDivision evaluateDivision = new EvaluateDivision();
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"), Arrays.asList("cd", "bc"));
        double[] expected = {3.75, 0.4, 5.0, 0.2};
        double[] result = evaluateDivision.calcEquation(equations, values, queries);
        assertArrayEquals(expected, result, 0.00001);
    }

    @Test
    void testExample3() {
        EvaluateDivision evaluateDivision = new EvaluateDivision();
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"));
        double[] values = {0.5};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "a"),
                Arrays.asList("a", "c"), Arrays.asList("x", "y"));
        double[] expected = {0.5, 2.0, -1.0, -1.0};
        double[] result = evaluateDivision.calcEquation(equations, values, queries);
        assertArrayEquals(expected, result, 0.00001);
    }

}