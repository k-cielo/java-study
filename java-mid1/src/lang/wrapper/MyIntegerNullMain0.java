package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1));//-1반환
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));//없는 값이므로 -1반환


    }

    private static int findValue(int[] intArr, int targer) {
        for (int value : intArr) {
            if (value == targer) {

                return value;
            }
        }
        return -1;
    }
}
