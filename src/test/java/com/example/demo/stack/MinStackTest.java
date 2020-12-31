package com.example.demo.stack;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
public class MinStackTest {



    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek() ){
                minStack.push(x);
            }
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop.equals(minStack.peek())){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

}
