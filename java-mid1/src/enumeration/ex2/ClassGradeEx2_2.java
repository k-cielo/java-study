package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*        컴파일 오류남 상수만 사용가능하기 때문에
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade,price);
        System.out.println("newClassGrade 등급의 할인 금액: "+result);
*/
    }
}
