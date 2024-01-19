package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;
        String a;

        if (distance<=1){
            a = "도보";
            System.out.println("도보");
        }else if (distance <=10){
            a = "자전거";
            System.out.println("자전거");
        }else if (distance <= 100){
            a = "자동차";
            System.out.println("자동차");
        }else {
            a = "비행기";
            System.out.println("비행기");
        }
        System.out.println(a+"를 이용하세요.");

    }
}
