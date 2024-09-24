package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5; //기본 용량

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2(){
        elementData = new Object[DEFAULT_CAPACITY];

    }

    public MyArrayListV2(int initialCapacity) {
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
