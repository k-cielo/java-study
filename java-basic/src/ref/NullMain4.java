package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();//얘를 참조하는 애가 없음
        bigData.data = new Data();

        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= "+bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value ="+bigData.data.value);
    }
}
