package nested.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();//생성할 때 어떤 인스턴스인지 참조를 알아야됨
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

        
    }
}
