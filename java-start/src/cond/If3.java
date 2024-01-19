package cond;

public class If3 {
    public static void main(String[] args) {

        int age = 14;

        if(age<=7){// 불필요한 조건검사를 함, 이미 미취학이라고 출력했는데 다음 조건을 모두 실행
            System.out.println("미취학");

        }
        if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if (age>=20){
            System.out.println("성인");
        }
    }
}
