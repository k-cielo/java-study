package casting;

public class Casting2 {
    public static void main(String[] args){

        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; 컴파일 오류가 발생
        intValue = (int)doubleValue;//이게 형변환 , 이 값을 형변환해서 넣어라
        System.out.println(intValue);

        int z = (int)10.5;
        System.out.println(z);
    }
}
