package class1;

public class ClassStart4 {
    public static void main(String[] args) {


        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;//인스턴스가 복사되는게 아니라 변수에 들어있는 값만 복사해서 넣음(참조형이면 안에 참조값주소를 복사해서 넣음, 절대 인스턴스를 복사한게 아님)
        students[1] = student2;


        System.out.println("이름:"+students[0].name+" 나이:"+students[0].age+"점수:"+students[0].grade);
        System.out.println("이름:"+students[1].name+" 나이:"+students[1].age+"점수:"+students[1].grade);

    }

}
