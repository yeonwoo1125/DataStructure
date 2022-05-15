package stack;

import java.util.Stack;

public class StackMethod {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=10; i++){
            stack.push(i);
        }
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(10);
        System.out.println(stack.contains(1));
        System.out.println(stack.indexOf(10));

    }
}
