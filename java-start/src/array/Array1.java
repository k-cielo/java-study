package array;

public class Array1 {
    public static void main(String[] args){

        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int student6 = 40;

        //비슷한 변수를 계속 선언해야됨
        //반복문 사용불가 => 변수이름이 다 다름

//        for (int i = 1; i<=6; i++){
//            System.out.println("학생"+i+" 점수: "+student1);//변수명 변경어려우므로 다 같은 점수 나옴
//        }

        System.out.println("학생1 점수: "+student1);
        System.out.println("학생2 점수: "+student2);
        System.out.println("학생3 점수: "+student3);
        System.out.println("학생4 점수: "+student4);
        System.out.println("학생5 점수: "+student5);
    }
}
