package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {

        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //dog의 참조값을 알고 싶을 때
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = "+ refValue);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = "+ refValue2);
    }
}
