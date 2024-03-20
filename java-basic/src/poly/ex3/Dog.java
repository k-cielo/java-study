package poly.ex3;

public class Dog extends AbstractAnimal{
    //불완전한 메서드를 자식이 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
