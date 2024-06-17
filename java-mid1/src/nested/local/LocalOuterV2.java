package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {//매개변수
        int localVar =1;//지역변수

        class LocalPrinter implements Printer{
            int value = 0;



            @Override
            public void print() {
                System.out.println("value="+value);
                System.out.println("localVar= "+localVar);
                System.out.println("paramVar= "+paramVar);//매개변수에도 접근가능
                System.out.println("outInstanceVar= "+outInstanceVar);

            }
        }

        LocalPrinter printer = new LocalPrinter();// 인스턴스 생성
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
