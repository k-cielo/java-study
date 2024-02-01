package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber =numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumber) {//비교를 했을 때 두 번째 항목이 첫번째보다 작으면 minNumber에 넣어서 계속 비교함
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {//배열의 0번째항목을 maxnumber에 넣어두고 계속 큰값이랑 비교하면서 값 갱신해서 넣어줌
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: "+minNumber);
        System.out.println("가장 큰 정수: "+maxNumber);
    }
}
