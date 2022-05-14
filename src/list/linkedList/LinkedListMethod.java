package list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
    public static void main(String[] args){
        List<Integer> linkedList = new LinkedList<>();

        //삽입
        linkedList.add(1);
        linkedList.add(1,2);

        //반환
        System.out.println(linkedList.get(1));

        //초기화
        linkedList.clear();

        for(int i=1; i<=10; i++)
            linkedList.add(i);

        //삭제
        linkedList.remove(4);
        linkedList.add(3,66);

        //변경
        linkedList.set(3,10000);
        System.out.println(linkedList.get(3));

        //출력
        for(int a : linkedList)
            System.out.print(a+" ");

    }
}
