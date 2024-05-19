package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    //객체로 만듦
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;


    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {

            //1부터 45사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            //중복되지 않은 경우에만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
}

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;//뽑은게 있으면 false반환
            }
        }
        return true; //없으면  true반환
    }
}
