package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
       // instanceValue++;//인스턴스 변수 접근, complie error
       // instanceMehtod();//인스턴스 메서드 접근, complie error

        staticValue++;//정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {//외부에 참조값을 넘겨와서 그걸로 접근하는 것.
        data.instanceValue++;//참조값 통해서 호출함
        data.instanceMethod();
    }
    public void instanceCall(){
        instanceValue++;//인스턴스 변수 접근
        instanceMethod();//인스턴스 메서드 접근, complie error

        staticValue++;//정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }
    private void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }
}
