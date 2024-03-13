package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a){
        this(a,0);//계속 this를 사용하더라도 언젠가 첫줄에 super를 사용해서 부모를 호출해야됨
        //super();//기본 생성자 생략가능
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super();//기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a+" b="+b);
    }
}
