package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        //2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][4];//행2, 열3

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }


        //반복문으로 변경
        for (int row = 0; row < arr.length; row++) {//arr.length는 행의 갯수
            for (int column = 0; column<arr[row].length; column++){//arr[row].length는 arr의 열의 갯수
                System.out.print(arr[row][column]+ " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.

        }
    }
}
