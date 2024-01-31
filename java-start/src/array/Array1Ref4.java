package array;

public class Array1Ref4 {
    public static void main(String[] args){

        int[] students = {90, 80, 70, 60, 50};// 배열의 생성과 초기화 간략하게 작성

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {//배열의 길이만큼
            System.out.println("학생"+(i+1)+"점수: "+students[i]);
        }
    }
}
