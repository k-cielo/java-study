package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {//매개변수
        int localVar =1;//지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;



            @Override
            public void print() {

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("value="+value);
                System.out.println("localVar= "+localVar);
                System.out.println("paramVar= "+paramVar);//매개변수에도 접근가능
                System.out.println("outInstanceVar= "+outInstanceVar);

            }
        }

        LocalPrinter printer = new LocalPrinter();// 인스턴스 생성
        //만약 localVar의 값을 변경한다면? 다시 캡쳐해야하나??
        //localVar = 10;컴파일오류
        //paramVar = 20;컴파일오류

        // 꼭 값을 바꿔야되는 상황이 오면 따로써라.
        int x = localVar +10;
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = "+field);
        }
    }
}
