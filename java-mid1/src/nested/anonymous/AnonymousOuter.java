package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {//매개변수
        int localVar =1;//지역변수




        Printer printer = new Printer() {//인터페이스를 구현하면서 구현체를 이름없이 만듦 바로 new로 생성
            //생성하면서 바로 body로 구현함
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);//매개변수에도 접근가능
                System.out.println("outInstanceVar= " + outInstanceVar);

            }
        };
        printer.print();
        System.out.println("printer.class="+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
