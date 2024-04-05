package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = "+ memberA);
        System.out.println("memberB = "+ memberB);

        //회원B의 주소를 부산으로 변경해야함
//        memberB.getAddress().setValue("부산");//컴파일오류
        memberB.setAddress(new ImmutableAddress("부산"));//새로 address만들어줌(b의 주소를 바꿔줌)
        //B가 불변이 아니라 B가지고 있는 address가 불변인 것임
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);

    }
}
