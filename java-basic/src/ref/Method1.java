package ref;

import javax.swing.*;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();//x001
        initStudent(student1, "학생1", 15,90);
        //           x001



        Student student2 = new Student();//x002
        initStudent(student2, "학생2", 16,80);


        printStudent(student1);
        printStudent(student2);

    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;//인스턴스에다가 넘겨온 매개변수 값을 대입해주는 것
        student.age = age;//x001의 age
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름:"+ student.name+" 나이:"+student.age+" 성적:"+student.grade);
    }
}
