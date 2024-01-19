package operator;

public class Logical2 {
    public static void main(String[] args) {

        int a = 15;
        //a는 1보다 크고 20보다 작다 and조건
        boolean result = a > 10 && a < 20;//(a>10)&&(a<20)
        System.out.println("result = "+result);
    }
}
