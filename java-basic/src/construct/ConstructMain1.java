package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //                          자바는 이 객체를 생성하고 동시에 생성이 메모리에 만들어지자마자 user1,15,90을 호출함
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16,80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름:"+member.name+" 나이:"+member.age+" 성적:"+member.grade);
        }
    }
}
