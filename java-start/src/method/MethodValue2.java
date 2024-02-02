package method;

public class MethodValue2 {
    public static void main(String[] args) {

        int number = 5;

        System.out.println("1. changeNumber 호출 전, num1: "+number);//5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1: "+number);//5
        //대원칙을 잘 기억해야됨. 자바는 항상 변수의 값을 복사해서 대입함
    }// main()에서 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘 다 number 로 같다
    //이름이 같아도 서로 완전히 다른 변수임

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, num2: "+number);//5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: "+number);//10
    }
}
