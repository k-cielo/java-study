package scope;

public class Scope1 {
    public static void main(String[] args) {


    int m = 10; //m 생존시작

        if(true){
            int x = 20;//x의 생존시작(if 코드블록안에서만 생존)
            System.out.println("if m =  "+m);
            System.out.println("if x =  "+x);
        }
    //x 생존종료
//        System.out.println("main x = "+x);오류 남
        System.out.println("main m = "+m);
    }
}