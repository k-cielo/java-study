package extends1.overriding;

public class Car {

    public void move(){

        System.out.println("차를 이동합니다.");
    }



    //기능추가(부모에만 추가하면 자식은 다 물려받게됨)
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }

}
