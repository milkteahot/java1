public class Rice extends Food {
    // 밥류 가격은 7000원으로 설정
    public int price = 7000;
    // 쌀 종류
    public String riceType = "현미";
    // 밥류 주문시 1000원 할인
    private int discount = 1000;
    // 밥 반찬
    public String[] sideDish = { "김치", "멸치볶음", "오뎅", "콩자반", "깍두기" };
 
    public Rice(String name, int amount) {
        super(name, amount);
        super.setMainIngredient("밥");
        super.price = this.price - this.getDiscount();
    }
 
    public void cookRice() {
        System.out.println("밥을 하고 있습니다. 쌀 종류는 " + this.riceType + "입니다.");
        // 밥하는 시간 20분으로 설정
        super.cookTime += 20;
    }
 
    public void printSide() {
        if (sideDish != null) {
            for (int i = 0; i < sideDish.length; i++) {
                System.out.print(sideDish[i]);
                if (i != sideDish.length - 1)
                    System.out.print(", ");
            }
        }
    }
 
    public void makeSide() {
        printSide();
        System.out.println("이 반찬으로 제공됩니다.");
        // 반찬 담는 시간 10분으로 설정
        super.cookTime += 10;
    }
 
    public int cooking() {
        super.cookTime = super.cooking();
        cookRice();
        makeSide();
        System.out.println("조리가 완료되었습니다.");
        return super.cookTime;
    }
 
    public void showInfo() {
        super.showInfo();
        System.out.println("선택하신 음식 종류: 밥류");
        System.out.print("밥 반찬: ");
        printSide();
        System.out.println();
        System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
    }
 
    public int getDiscount() {
        return discount;
    }
 
    public void setDiscount(int discount) {
        this.discount = discount;
    }
 
}
 
