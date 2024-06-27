package nested.anonymous.ex;

import java.util.Random;

//익명 클래스로 만들기
public class ExRefMainV5 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료


        System.out.println("프로그램 종료");
    }




    public static void main(String[] args) {


      

        System.out.println("Hello 실행");
        hello(() -> {//함수의 코드블록 직접 전달(함수를 인자로 전달가능)

            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = "+randomValue);

        });

        hello(() -> {

            for (int i = 0; i < 3; i++) {
                System.out.println("i = "+i);
            }

        });
    }
}