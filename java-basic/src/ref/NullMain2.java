package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;//NullPointerExcetion 예외 발생
        //참조값이 없음, =>예외 발생시킴
        System.out.println("data ="+data.value);
    }
}
