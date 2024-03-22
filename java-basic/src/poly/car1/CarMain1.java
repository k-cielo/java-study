package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver =new Driver();

        //차량선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량변경(model3 -> newCar) 다른 걸로 바꿔도 driver의 코드는 전혀 변경할 필요 X
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}

