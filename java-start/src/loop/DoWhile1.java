package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        do{//앞에 한번하고 뒤에 조건에 따라 빠져나감
            //do while문은 무조건 최초 1번은 실행함
            System.out.println("현재 숫자는 :"+i);

        }while(i<3);


    }
}
