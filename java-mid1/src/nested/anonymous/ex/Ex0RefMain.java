package nested.anonymous.ex;

public class Ex0RefMain {

//    public static void helloJava(){
//        System.out.println("프로그램 시작");//변하지 않는 부분
//        System.out.println("Hello Java");//변하는 부분
//        System.out.println("프로그램 종료");//변하지 않는 부분
//    }
//    public static void helloSpring(){
//        System.out.println("프로그램 시작");//변하지 않는 부분
//        System.out.println("Hello Java");//변하는 부분
//        System.out.println("프로그램 종료");//변하지 않는 부분
//    }


    public static void hello(String str){
        System.out.println("프로그램 시작");
        //변하는 부분 시작
        System.out.println(str);//str, 변하는 부분
        //변하는 부분 종료
        System.out.println("프로그램 종료");
    }//=>중복을 제거하면서 메서드의 재사용성을 높일 수 있다.

    public static void main(String[] args) {
         hello("Hello Java");
         hello("Hello Spring");
    }
}
