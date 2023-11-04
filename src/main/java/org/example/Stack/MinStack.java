package org.example.Stack;

import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.isEmpty()) {
            return; // Avoid popping from an empty stack
        }

        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public Integer top() {
        if (stack.isEmpty()) {
            return null; // Return null for an empty stack
        }
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}