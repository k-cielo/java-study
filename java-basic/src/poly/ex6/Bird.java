package poly.ex6;

//상속을 받을 때 클래스는 하나만 상속가능하고 인터페이스는 무한정 상속받을 수 있다.
public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
