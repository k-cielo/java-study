package memory;

public class JavaMemoryMain1 {

    //statck구조: main이 가장 먼저 시작되고 main이 가장 나중에 종료됨

    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

    }


    static void method1(int m1){
        System.out.println("mehtod1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("mehtod1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
