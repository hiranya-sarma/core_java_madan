package com.eazybytes.collection.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
        * Even though Stack supports listIterator(), modern Java prefers:
        * Deque
        * ArrayDeque
        * because Stack is considered legacy.
        * */
        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(10); //3
        stack.push(20); //2
        stack.push(30); //1

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(20));
        int topElement = stack.peek();
        System.out.println("Top element: "+topElement);
        int poppedElement = stack.pop();
        System.out.println("Popped element: "+poppedElement);

        stack.clear();
        System.out.println("Stack is cleared"+" "+stack);
    }
}
