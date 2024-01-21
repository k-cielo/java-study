package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++){//블록 내부, for문 내부
            System.out.println("for m = "+m);//블록 내부에서 외부는 접근 간으
            System.out.println("for i = "+i);

        }//i의 생존 종료
//        System.out.println("main i = "+i);i는 스코프범위 벗어났기때문에 사용 불가능
        System.out.println("main m = "+m);


    }
}
