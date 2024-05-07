package lang.string.chaining;

public class MethodChainingMain3 {
//자기자신을 반화하는데 반환값을 어떻게 써야되는지
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
//        int result = x001.add(1).add(2).add(3).getValue();,참조값에 계속 체인처럼 연결되어있음.
        int result = adder.add(1).add(2).add(3).getValue();



        System.out.println("result = "+ adder);
    }
}
