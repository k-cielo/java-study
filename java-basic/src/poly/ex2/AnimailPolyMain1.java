package poly.ex2;

public class AnimailPolyMain1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    private static void soundAnimal(Animal animal) {//메서드오버라이딩때문에 자식메서드가 우선나옴
        System.out.println("동 물 소리 테스트 시작");
        animal.sound();
        System.out.println("동 물 소리 테스트 종료");

    }
}
