// package stackAndQueue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(14);
        stack.push(5);
        stack.push(18);
        stack.push(9);
        stack.push(45);
        while (!stack.empty()) {
            System.out.println(stack.pop());
            
        }
    }
}
