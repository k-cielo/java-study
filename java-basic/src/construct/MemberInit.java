package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        //멤버변수와 매개변수의 이름이 같음 , this를 써주는 이유는 자기자신의 이름을 가짐
        //내 인스턴스의 이름, 내 인스턴스의 age등..
    }
}
