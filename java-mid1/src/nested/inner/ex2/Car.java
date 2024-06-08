package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }


    public void start(){
        engine.start();
        System.out.println(model+" 시작완료");
    }

    private class Engine {

       //Car에 대한 정보가 없어도 안에서 접근가능

        public void start(){
            System.out.println("충전 레벨 확인: "+ChargeLevel);
            System.out.println(Model +"의 엔진을 구동합니다.");
        }
    }


}
