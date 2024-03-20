package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스 생성불가 완전 추상이기때문에
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();


        soundAnimal(cat);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    //변하지않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
