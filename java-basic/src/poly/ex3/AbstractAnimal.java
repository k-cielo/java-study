package poly.ex3;

public abstract class AbstractAnimal {

    //자식 오버라이딩 해야되는 목적으로 만듦(직접 인스턴스 생성X)
    public abstract void sound() ;


    //이건 자식의 기능을 상속받아서 사용하는 목적으로 만듦
    public void move(){
        System.out.println("동물이 움직입니다.");
    }


}
