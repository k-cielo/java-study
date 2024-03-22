package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngin() {
        System.out.println("NewCar.offEngin");

    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
