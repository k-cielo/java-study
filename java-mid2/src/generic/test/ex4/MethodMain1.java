package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입인자(Type Argument)명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = "+result );
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);


        //생략가능 - 자바가 타입추론해줌
        System.out.println("타입추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
