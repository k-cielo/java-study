package extends1.super1;

public class Child extends Parent {

    public String value = "child";


    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = "+this.value);//this생략가능(자기자신, 내타입에서 찾는 것)
        System.out.println("super value = "+super.value);//(부모타입에서 찾는 것)


        this.hello();
        super.hello();
    }
}
