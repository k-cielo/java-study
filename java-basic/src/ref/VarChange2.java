package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;//인스턴스가 복사되서 만들어진게 아니라 참조값만 복사함

        System.out.println("dataA 참조값="+dataA);//참조값
        System.out.println("dataB 참조값="+dataB);//참조값, dataA와 dataB는 같은 참조값이 나옴
        System.out.println("dataA.value="+dataA.value);//10
        System.out.println("dataB.value="+ dataB.value);//10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value="+dataA.value);//20
        System.out.println("dataB.value="+ dataB.value);//20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");//실제 인스턴스는 하나이고 참조값이 하나의 인스턴스를 가리킴 그래서 인스턴스의 값이 바뀌면 dataA, B둘다 같은 값으로 변경됨
        System.out.println("dataA.value="+dataA.value);//30
        System.out.println("dataB.value="+ dataB.value);//30
    }
}
