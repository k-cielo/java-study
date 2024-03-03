package extends1.ex3;

public class ElectricCar extends Car {
    //move 쓸 필요 X, 부모의 기능을 다 물려받음
    public void charge(){
        System.out.println("충전합니다.");
    }
}
