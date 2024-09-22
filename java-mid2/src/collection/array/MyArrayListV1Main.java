package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();//배열을 편리하게 사용하기 위해 만듦
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);


        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());;
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'Z') = " + list.set(2, "Z"));//바꾸고 기존값출력
        System.out.println(list);


        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);


        //범위초과, capacity(배열의 크기)가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
    }
}
