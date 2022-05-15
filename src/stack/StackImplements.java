package stack;

import java.util.Stack;

public class StackImplements {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=10; i++)
            stack.push(i);

        System.out.println(stack);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

        stack.clear();
        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(3);
        System.out.println(stack.indexOf(3));
        System.out.println(stack.contains(2));
        System.out.println(stack.capacity());
    }
}
