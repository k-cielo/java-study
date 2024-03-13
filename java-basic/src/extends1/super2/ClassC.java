package extends1.super2;

public class ClassC extends ClassB {

    public ClassC(){
        super(10, 20);//기본생성자가 아니므로 직접 정해야됨
        System.out.println("ClassA 생성자");
    }
}
