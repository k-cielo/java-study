package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {


        //모든  ENUM반환
        Grade[] values = Grade.values();
        System.out.println("value = "+ Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = "+value.name()+" , ordinal="+value.ordinal());
        }


        //string -> ENUM 변환, 잘못된 문자  IllegalArgumentException 예외발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = "+gold);//toString() 오버라이딩 기능
    }
}
