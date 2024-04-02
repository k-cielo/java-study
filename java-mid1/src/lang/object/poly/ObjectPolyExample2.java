package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();//Objcect 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
//        Object[] objects = new Object[3]; 위와 같은 코드
//        objects[0] = dog;
//        objects[1] = car;
//        objects[2] = objects;

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+objects.length);
    }
}
