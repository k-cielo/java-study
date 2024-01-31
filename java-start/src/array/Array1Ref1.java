package array;

public class Array1Ref1 {
    public static void main(String[] args){

        int[] students; //배열 변수 선언(int형 배열을 담을 수 있는 변수 선언)
        students = new int[5];//배열생성 - int가 5개 연결되어있는 그릇 만듦


        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
//      students[5] = 40; 인덱스 허용범위를 넘어감


        /*
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int student6 = 40;
         */
        //비슷한 변수를 계속 선언해야됨
        //반복문 사용불가 => 변수이름이 다 다름


//        for (int i = 1; i<=6; i++){
//            System.out.println("학생"+i+" 점수: "+student1);//변수명 변경어려우므로 다 같은 점수 나옴
//        }




        //변수 값 사용
        System.out.println("학생1 점수: "+students[0]);
        System.out.println("학생2 점수: "+students[1]);
        System.out.println("학생3 점수: "+students[2]);
        System.out.println("학생4 점수: "+students[3]);
        System.out.println("학생5 점수: "+students[4]);
    }
}
