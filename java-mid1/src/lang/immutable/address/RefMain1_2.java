package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        //여러 변수가 하나의 객체를 공유하는 것을 막을 방법은 없다. => 객체를 공유하지 않으면 됨

        Address a = new Address("서울");//x001
        Address b = new Address("서울");//x002
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b.setValue("부산");//b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = "+b);
        //b는 그대로 서울로 유지됨, a랑 b는 서로 다른 참조를 보게 됨
    }

}
