package cond;

public class If6 {
    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >=   10000){//이쪽만 수행되고 어린이 할인이 적용되지 않는다.
            //조건 만족해서 실행하고 빠져나옴
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 10000할인");
        }else if(age <= 10){
            discount = discount+1000;
            System.out.println("어린이 1000원 할인");
        }else{
            System.out.println("할인없음");
        }

        System.out.println("총 할인 금액은 "+ discount+"원입니다.");


        if(true)
            System.out.println("if문에서 실행됨");
            //if문이 하나일 때 블록 지워도 됨 블록 안넣으면 딱 한줄만 적용됨
            System.out.println("이건 실행안됨");
            //둘 다 실행시키려면 코드블록안으로 넣어야 된다



        //또 다른 예시
        if(false)
            System.out.println("if문에서 실행됨 flase니까 안됨");
            System.out.println("if문에서 밖이여서 이건 됨");
    }
}
