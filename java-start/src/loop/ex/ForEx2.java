package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//
//        int num = 0;
//        for (int i = 1; i <=10; i++){
//            num+=2;이걸 sout뒤에 작성해야됨 int num을 2로 넣을 경우에는
//            System.out.println(num);
//        } 내가 푼것
        for (int num=2, count = 1; count<=10; num += 2, count++){
            System.out.println(num);
        }
    }
}
