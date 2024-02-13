package ref;

public class NullMain1 {
    public static void main(String[] args) {


        Data data = null;//data 변수에는 아직 가리키는 객체가 없다
        System.out.println("1. data = " + data);
        data = new Data();//참조값있음
        System.out.println("2. data = " + data);
        data = null;//다시 값x->앞서만든 Data인스턴스를 참조하지 않음
        System.out.println("3. data ="+data);
    }
}
