package list.arrayList;

public class ArrayListImplements {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList("String",10);

        //삽입
        arrayList.add("11");
        arrayList.add(1,"12");

        //반환
        System.out.println(arrayList.get(0));

        //크기
        System.out.println(arrayList.size());

        //초기화
        arrayList.clear();

        //배열 비었는지 여부
        System.out.println(arrayList.isEmpty());

        arrayList.add("100");

        //삭제
        System.out.println(arrayList.remove(0));

        arrayList.add("11");
        arrayList.add(1,"12");

        arrayList.printAll();
    }
}

class ArrayList{
    private Object[] arr;
    //arr의 크기
    private int capacity;
    //현재 사용하는 크기
    private int size = 0;
    private String type;

    ArrayList(String type){
        this.type = type;
        capacity = 1;
        arr = new Object[capacity];
    }

    ArrayList(String type, int capacity){
        this.type = type;
        this.capacity = capacity;

        arr = new Object[capacity];
    }

    //값 삽입하기
    public void add(Object element){
        checkMax(size, capacity);
        if(checkType(type, element.getClass().getSimpleName()))
            arr[size++] = element;
        else throw new IllegalStateException("타입 에러");

    }

    //원하는 위치에 값 삽입하기
    public void add(int index, Object element){
        checkMax(size, capacity);
        if(checkType(type, element.getClass().getSimpleName())){
            for(int i=size; i>=index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = element;
            size++;
        }
        else throw new IllegalStateException("타입 에러");
    }

    //값 반환하기
    public Object get(int index){
        if(isEmpty()){
            throw new IllegalStateException("배열 비었음");
        }
        return arr[index];
    }

    //값 삭제하기
    public Object remove(int index){
        if(isEmpty()){
            throw new IllegalStateException("배열 비었음");
        }
        Object result = arr[index];
        arr[index] = null;
        size--;

        for(int i=index; i<size; i++){
            arr[i] = arr[i+1];
        }

        return result;
    }

    //배열 비었는지 여부
    public boolean isEmpty(){
        if(size <=0){
            return true;
        }
        return false;
    }

    //배열 크기
    public int size(){
        return this.size;
    }

    //배열 초기화하기
    public void clear(){
        size = 0;
        arr = new Object[capacity];
    }

    //배열 요소 출력하기
    public void printAll(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private boolean checkType(String type, String eleType){
        return type.equals(eleType);
    }

    private void checkMax(int size, int capacity){
        if(size == capacity){
            expandArray();
        }
    }

    private void expandArray(){
        capacity  = capacity*2;
        Object[] newArray = new Object[capacity];
        copyArr(newArray, arr);
        arr = new Object[capacity];
    }

    private void copyArr(Object[] newArray, Object[] arr){
        for(int i=0; i< arr.length; i++){
            newArray[i] = arr[i];
        }
    }
}