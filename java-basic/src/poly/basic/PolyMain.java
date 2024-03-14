package poly.basic;



public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();//parent 자기 자신만 참조
        parent.parentMethod();

        //자식변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();//부모 메서드 호출 가능
        child.childMethod();//자기자신 메서드 호출 가능

        //부모 변수가 자식 인스턴스 참조(다형적 참조), 부모는 자식을 담을 수 있음
        System.out.println("Parent -> Child");
        Parent poly = new Child();//부모타입은 자식을 참조 할 수 있음
        //poly는 타입이 parent임. 그래서 parent의 메서드부터 찾음
        poly.parentMethod();

//        Child child1 = new Parent();// 자식은 부모를 담을 수 없다.
//        poly.childMethod()//부모는 자식의 기능을 호출할 수 없다.
    }
}
