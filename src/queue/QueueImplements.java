package queue;

import java.util.Objects;

public class QueueImplements {
    public static void main(String[] args){
        ArrayQueue arrayQueue = new ArrayQueue("Integer");

        arrayQueue.enqueue(2);
        arrayQueue.enqueue(1);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.peek());
        arrayQueue.printQueue();
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.isFull());
    }
}

class ArrayQueue{
    private int capacity;
    private String type;
    private int front;
    private int rear;
    private Object[] queue;

    ArrayQueue(String type, int capacity){
        this.type = type;
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        queue = new Object[capacity];
    }

    ArrayQueue(String type){
        this.type = type;
        this.front = -1;
        this.rear = -1;
        this.capacity = 1000;
        queue = new Object[capacity];
    }

    public boolean isFull(){
        return (this.rear == this.capacity-1);
    }

    public boolean isEmpty(){
        if(this.front == this.rear){
            front = -1;
            rear = -1;
        }
        return (this.front == this.rear);
    }

    public void enqueue(Object element){
        checkType(element);
        checkIsFull();
        queue[++rear] = element;
    }

    public Object dequeue(){
        checkIsEmpty();
        ++front;
        Object ele = queue[front];
        queue[front] = null;

        checkIsEmpty();

        return ele;
    }

    public Object peek(){
        checkIsEmpty();

        return queue[front+1];
    }
    public void clear(){
        checkIsEmpty();

        this.front = -1;
        this.rear = -1;
        queue = new Object[this.capacity];
    }

    public void printQueue(){

        for(Object ele : queue){
            if(ele != null)
                System.out.print(ele+" ");
        }
    }

    private void checkIsEmpty(){
        if(isEmpty()){
            throw new IllegalStateException("배열이 비었음");
        }
    }
    private void checkIsFull(){
        if(isFull()){
            throw  new IllegalStateException("배열이 가득참");
        }
    }
    private void checkType(Object element){
        if(!Objects.equals(this.type, element.getClass().getSimpleName())){
            throw new IllegalStateException("타입이 틀림");
        }
    }
}
