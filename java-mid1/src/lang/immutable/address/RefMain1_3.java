package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //main메서드만 보면 A의 값이 함께 부산으로 변경되는 이유를 찾기 어려움.



        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b.setValue("부산");//b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = "+b);
    }

    private static void change(Address address, String changeAdress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAdress);
        address.setValue(changeAdress);

    }

}
