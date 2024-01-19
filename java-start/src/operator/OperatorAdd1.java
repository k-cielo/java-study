package operator;

public class OperatorAdd1 {

    public static void main(String[] args){

        int a = 0;
        a = a+1;
        System.out.println(a);//1

        a = a+1;
        System.out.println(a);//2

        //위에걸 하나하나 작성하기 귀찮아서 증감연산자를 만듦

        //증감연산자
        ++a;//a=a+1
        System.out.println("a = "+a);//3

        ++a;//a=a+1
        System.out.println("a = "+a);//4

        --a;
        System.out.println(a);//4

    }
}
