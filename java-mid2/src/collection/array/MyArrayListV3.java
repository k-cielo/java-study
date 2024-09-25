package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5; //기본 용량

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3(){
        elementData = new Object[DEFAULT_CAPACITY];

    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();//사이즈 늘려주는 메서드
        }


        elementData[size] = e;
        size++;//배열의 순서대로 값 집어넣음
    }

    //코드 추가
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();//사이즈 늘려주는 메서드
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);

/*  한 줄로 작성가능
       Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
 */

    }

    public Object get(int index) {
        return elementData[index];
    }


    public Object set(int index, Object element) {

        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        size --;
        elementData[size] = null;
        return  oldValue;
        
    }

    //코드 추가 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }

        }
        return -1;
    }
    public String toString(){
//        [1, 2, 3, null, null]//size=3
//        [1, 2, 3]//size=3

        //size 크기만큼만 출력하고싶음

        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;//배열에서 size만큼만 카피해서 가져옴
    }

}
