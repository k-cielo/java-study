package cond;

public class If1 {
    public static void main(String[] args) {

        int age = 20;

        if(age>=18){//조건이 true인경우에만 조건 출력
            System.out.println("성인입니다.");

        }
        if(age<18){//false이므로 코드블록을 실행하지않음
            System.out.println("미성년자입니다.");

        }
    }
}
