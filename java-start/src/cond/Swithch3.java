package cond;

public class Swithch3 {
    public static void main(String[] args) {

        int grade = 2;
        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;//2에서 break가 없으므로 3까지 내려가서 3000원이 되어버림
                break;
            default:
                coupon = 500;

        }
        System.out.println("발급받은 쿠폰"+coupon+"원");
    }
}
