package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자="+valueData.value);
    }


    //value데이터와  증가시키는 메소드가 분리되어있음
    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value="+valueData.value);
    }
}
