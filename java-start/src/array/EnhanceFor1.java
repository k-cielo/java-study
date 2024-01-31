package array;

public class EnhanceFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        //단축키 iter
        for (int number : numbers) {

        }

        //향상된 for문을 사용할 수 없을 때,  증가하는 index 값 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number"+i+"번의 결과는: "+numbers[i]);//이 때는 i의 값이 필요하기 때문에 향상된 for문 사용 X
            //증가하는 index문을 loop안에서 직접 써야될 때
        }
    }
}
