package casting.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");



       /* 반복문 축약
        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;//몇개 더했는지 숫자 구함(평균구하기위해)
        }

        */

        while ((input = scanner.nextInt()) != -1){//while이 참인경우에는 넘어가지만 아닌경우에는 실행안되고 빠져나감
            //-1은 거짓이므로 while실행 X, 입력받을 때 바로 확인
            sum += input;
            count++;
        }








        double average = (double)sum / count;//double로 캐스팅해줘야됨
        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+average);
    }
}
