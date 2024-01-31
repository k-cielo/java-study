package array;

public class Array1Ref3 {
    public static void main(String[] args){

        int[] students; //배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50};//배열생성, 초기화할 때 특별한 값을 넣어줄 수 있음
//      합쳐서 작성해도됨
        //int[] students = new int[] {90, 80, 70, 60, 50};

        //변수 값 사용
        //배열 리펙토링 변수값 사용을 반복문으로 바꿈
        for (int i = 0; i < students.length; i++) {//배열의 길이만큼
            System.out.println("학생"+(i+1)+"점수: "+students[i]);
        }
    }
}
