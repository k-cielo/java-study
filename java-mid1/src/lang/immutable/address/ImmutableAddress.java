package lang.immutable.address;

public class ImmutableAddress {
//상태가 바뀌면 안되므로 final로 바꿈(한번 값을 생성자에서 생성하고 나면 갑 변경 불가)
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }



    public String getValue() {
        return value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    }값 변경 불가

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
