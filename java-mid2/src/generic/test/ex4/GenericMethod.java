package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: "+obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print: "+t);
        return t;
    }

    //제너릭 타입보다 제너릭 메서드가 높은 우선순위를 가진다. 따라서 printAndReturn()은 제네릭 타입과는 무관하고 제네릭 메서드가 적용된다.
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: "+t);
        return t;
    }
}
