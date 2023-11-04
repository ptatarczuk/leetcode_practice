package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();

        // Test pushing elements and getting the minimum
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());

        // Test popping an element
        minStack.pop();
        assertEquals(0, minStack.top());

        // Test getting the new minimum after popping
        assertEquals(-2, minStack.getMin());
    }

    @Test
    public void testEmptyStack() {
        MinStack minStack = new MinStack();

        // Test an empty stack
        assertEquals(Integer.MAX_VALUE, minStack.getMin());
        assertNull(minStack.top());

        // Try popping from an empty stack, should not throw an exception
        minStack.pop();
    }

    @Test
    public void testMultiplePops() {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(1);

        // Test popping multiple elements
        minStack.pop();
        assertEquals(2, minStack.top());
        minStack.pop();
        assertEquals(3, minStack.top());
    }

}