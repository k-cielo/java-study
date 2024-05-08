package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};

        System.out.println(findValue(intArr, -1));//-1반환
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));//없는 값이므로 null반환


    }

    private static MyInteger findValue(MyInteger[] intArr, int targer) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == targer) {

                return myInteger;
            }
        }
        return null;//값이 없으면 null반환
    }
}
