package class1;

public class ClassStart3 {
    public static void main(String[] args) {


        Student student1; // 첫 번째 학생을 담아둘 수 있는 변수를 선언
        student1 = new Student();//메모리에 학생이라는 걸 만들어서 쓸 수 있게 됨=>학생이라는 정보를 student변수에 담아둠
        // student1변수를 통해서 학생(Student클래스)을 사용할 수 있음
        student1.name = "학생1";//클래스로 만든 건 .을 통해서 접근가능
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);//참조값 주소
        System.out.println(student2);

        System.out.println("이름:"+student1.name+" 나이:"+student1.age+"점수:"+student1.grade);
        System.out.println("이름:"+student2.name+" 나이:"+student2.age+"점수:"+student2.grade);

    }
}
