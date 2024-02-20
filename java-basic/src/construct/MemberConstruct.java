package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);//자기자신의 생성자를 호출하는 것, 생성자안에서만 사용가능

    }

    //생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name+", age="+age+", grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
