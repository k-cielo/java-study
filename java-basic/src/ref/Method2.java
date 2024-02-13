package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = creatStudent("학생1", 15, 90);
        System.out.println("student1="+student1);
        Student student2 = creatStudent("학생2", 16, 80);
        System.out.println("student2="+student2);

        printStudent(student1);
        printStudent(student2);

    }

    //이메서드 호출하면 Student  만들고 만들어진  student값 셋팅한다음에
    //그 다음에 만들어진  student의 참조값을 반환함
    static Student creatStudent(String name, int age, int grade) {
        Student student = new Student();//x001
        System.out.println("student ="+student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;//x001 (참조값반환)
    }



    static void printStudent(Student student) {
        System.out.println("이름:"+ student.name+" 나이:"+student.age+" 성적:"+student.grade);
    }
}
