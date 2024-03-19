package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

//        Caw[] cawArr = {dog, cat, caw};



        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");


        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        sound(caw);
//        sound(cat);//타입이 다르므로 안됨

    }

    private static void sound(Caw caw) {//Caw 전용 메서드
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}