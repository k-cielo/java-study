package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {


        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("a = "+a);
        System.out.println("b = "+b);

//        b.setValue("부산");//b의 값을 부산으로 변경해야함
        b = new ImmutableAddress("부산");//값 변경 안되므로 새로운 객체를 생성해 값 넣음
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = "+b);
    }

}
