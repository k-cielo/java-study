package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int intValue = integer1;//오토박싱 지원됨
        System.out.println("intValue = " + intValue);

        //int -> Integer
        Integer integer2 = intValue;//오토언박싱 지원됨
        System.out.println("integer2 = "+integer2);
    }
}
