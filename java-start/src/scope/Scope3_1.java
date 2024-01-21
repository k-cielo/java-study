package scope;

public class Scope3_1 {
    public static void main(String[] args){
        int m = 10;
        int temp = 0;//temp는 생존범위가 if에서만 사용해도되는데 스코프범위가 넓어지면 메모리낭비가 된다.


        if (m > 0){
            temp = m * 2;
            System.out.println("temp = "+temp);
        }
        System.out.println("m = "+m);
    }
}
