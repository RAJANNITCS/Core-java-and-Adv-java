// WAP to demostrating Stack in collections 

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Step 1 : Create Stack
        Stack<Integer> stack = new Stack<>();

        // Step 2 : Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Step 3 : print stack 
        System.out.println("Print stack = " + stack);

        // Step 4 : Peek top element
        System.out.println("Peek top element = " + stack.peek());

        // Step 5 : Pop element
        System.out.println("Pop element = " + stack.pop());

        // Step 6 : check stack
        System.out.println("check stack = " + stack);

        // Step 7 : Check if empty
        System.out.println("check stack is empty = " + stack.isEmpty());
    }
}
