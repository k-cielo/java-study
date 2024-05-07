package lang.string.chaining;

public class MethodChainingMain2 {
//자기자신을 반화하는데 반환값을 어떻게 써야되는지
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();

        System.out.println("result = "+result);

        System.out.println("result = "+ adder);//다 같은걸 반환함, 모든 같은 참조를 사용함
        System.out.println("result = "+ adder1);
        System.out.println("result = "+ adder2);
        System.out.println("result = "+ adder3);
    }
}
