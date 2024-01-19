package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        int a= 1;
        int b = 0;


        //전위증감연산자
        b = ++a;// a 의 값을 먼저 증가시키고 , 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = "+b);


        //후위증감연산자

        a = 1;
        b = 0;

        b = a++;//a의 현재 값을 b에 먼저 대입하고, 그 후에 a값을 증가시킴
        //대입연산자를 먼저 하고 값의 증감을 제일 마지막에 함

        System.out.println("a = " + a + ", b = "+b);

        ++a;
        a++;
        //이런경우는 그냥 자기자신의 것만 증가시키기 때문에 둘 중에 무얼 써도 같은결과이므로 상관없음
    }
}
