package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {

        int sum = 0;//누적합
        int max = 100;
        int i = 0;//count하는 변수
        while (i<=max){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
