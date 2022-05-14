package list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args){
        //타입 지정해서 생성
        List<Integer> arrayList1 = new ArrayList<>();
        //초기 용량 지정해서 생성
        List<String> arrayList2 = new ArrayList<>(30);
        //Arrays.asList
        List<Double> arrayList3 = new ArrayList<>(Arrays.asList(1.1,2.2,3.3));

        //값 추가하기
        arrayList1.add(0,10);
        for(int i=0; i<10; i++){
            arrayList1.add(i);
            arrayList2.add(String.valueOf(i));
        }
        System.out.println("arrayList1 : "+arrayList1);
        System.out.println("arrayList2 : "+arrayList2);

        //값 변경하기
        for (int i=1; i<=10; i++){
            arrayList2.set(i-1, String.valueOf(i));
        }
        System.out.println("변경된 arrayList2 : "+arrayList2);

        //값 삭제하기
        System.out.println(arrayList1.remove(0));
        System.out.println(arrayList2.remove("1"));

        //값 출력하기
        for (Integer integer : arrayList1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Iterator<String> iterator = arrayList2.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //값 저장 유무
        System.out.println(arrayList1.contains(111));
        System.out.println(arrayList2.contains("2"));
        System.out.println(arrayList3.indexOf(1.1));
        System.out.println(arrayList3.indexOf(4.1));

        //기타 메서드
        System.out.println(arrayList1.size());
        System.out.println(arrayList2.isEmpty());
        arrayList3.clear();
        System.out.println(arrayList3.isEmpty());
    }
}
