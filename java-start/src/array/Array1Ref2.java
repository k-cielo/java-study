package array;

public class Array1Ref2 {
    public static void main(String[] args){

        int[] students; //배열 변수 선언(int형 배열을 담을 수 있는 변수 선언)
        students = new int[5];//배열생성 - int가 5개 연결되어있는 그릇 만듦


        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("배열의 길이:"+students.length);


        //변수 값 사용
        //배열 리펙토링 변수값 사용을 반복문으로 바꿈
        for (int i = 0; i < students.length; i++) {//배열의 길이만큼
            System.out.println("학생"+(i+1)+"점수: "+students[i]);
        }
    }
}
