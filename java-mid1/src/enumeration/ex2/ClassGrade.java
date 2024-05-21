package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();//x001
    public static final ClassGrade GOLD = new ClassGrade();//x002
    public static final ClassGrade DIAMOND = new ClassGrade();//x003

    //private 생성자 추가
    private ClassGrade(){}//생성이 막혀있으니 위에 있는 상수만 쓰라는 뜻
}
