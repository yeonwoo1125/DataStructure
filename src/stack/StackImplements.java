package stack;


import java.util.Objects;

public class StackImplements {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack("Integer",96);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        //System.out.println(stack.peek());
        //stack.clear();
        //stack.pop();
        //stack.clear();

        stack.push(100);
        //stack.push("1");
        for(int i=1; i<=95; i++)
            stack.push(i);
        stack.printStack();
    }
}
class ArrayStack{
    private int top;
    private int capacity;
    private Object arr[];
    private String type;

    ArrayStack(String type){
        this.type = type;
        this.top = -1;
        this.capacity = 100;
        arr = new Object[capacity];
    }
    ArrayStack(String type, int capacity){
        this.type = type;
        this.top = -1;
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top >= this.capacity-1);
    }

    public int size(){
        return this.capacity+1;
    }
    public void push(Object element){
        checkType(element);
        checkIsFull();

        arr[++top]  = element;
    }

    public Object pop(){
        checkIsEmpty();
        Object ele = arr[top];
        arr[top] = null;
        --top;
        return ele;
    }

    public Object peek(){
        checkIsEmpty();
        return arr[top];
    }

    public void clear(){
        checkIsEmpty();

        this.top = -1;
        arr = new Object[this.capacity];
    }

    public void printStack(){
        for(Object ele : arr){
            if(ele!=null)
                System.out.print(ele+" ");
        }
    }

    private void checkType(Object obj){
        if(!Objects.equals(this.type, obj.getClass().getSimpleName())){
            throw new IllegalStateException("타입 에러");
        }
    }
    private void checkIsFull(){
        if(isFull()){
            throw new IllegalStateException("스텍이 가득참");
        }
    }
    private void checkIsEmpty(){
        if(isEmpty()){
            throw new IllegalStateException("스텍이 비었음");
        }
    }
}
