package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;//객체가 생성될때마다 인스턴스의 멤버 변수인 count값을 증가시킨다.
    }
}
