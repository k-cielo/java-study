package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        //제약조건, 검증로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");

        } else {//정상로직

            //items의 0번에다가 넣음
            items[itemCount] = item;
            itemCount++;//1개씩 증가시킴

        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:"+item.getName()+", 합계:"+item.getTotalPrice());
        }
        System.out.println("전체 가격의 합:"+calculateTotalPrice());
    }

    //전체가격의 합
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
