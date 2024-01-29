package casting.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;//a의 값 10을 보관


        //코드시작
        temp = a;//10
        a=b;
        b = temp;

        //종료
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
}
