package poly.ex.pay1;

public abstract class PayStore {//결제수단관리와 보관

    public static Pay findPay(String option) {

            if (option.equals("kakao")) {
                return new KakaoPay();//부모가 자식 담음

            } else if (option.equals("naver")) {
                return new NaverPay();

            }else if (option.equals("new")) {
                return new NewPay();

            }else {
               return new DefaultPay();
            }

    }
}
