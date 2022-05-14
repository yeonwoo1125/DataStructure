package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        
        //peek은 가져만 옴
        System.out.println(queue.peek());
        
        //가져온 후 삭제
        System.out.println(queue.poll());

        for(int i=1; i<=10; i++)
            queue.add(i);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        queue.remove();
        System.out.println();
        for(int a : queue)
            System.out.print(a+" ");
    }
}
