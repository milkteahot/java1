public class Soup extends Food {
    // 탕류 가격은 10000원으로 설정
    public int price = 10000;
    // 탕 재료
    public String[] soupIngredient = { "고추장", "멸치", "다시다", "파", "시레기" };
    // 육수 소스
    private String soupSauce = "비법소스";
 
    public Soup(String name, int amount) {
        super(name, amount);
        super.setMainIngredient("탕");
    }
 
    public void putIngredient() {
        printIngredient();
        System.out.println("을 넣습니다.");
        // 재료 넣는 시간 10분으로 설정
        super.cookTime += 10;
    }
 
    public void printIngredient() {
        if (soupIngredient != null) {
            for (int i = 0; i < soupIngredient.length; i++) {
                System.out.print(soupIngredient[i]);
                if (i != soupIngredient.length - 1)
                    System.out.print(", ");
            }
        }
    }
 
    public void boilSoup() {
        System.out.println("탕을 끓이고 있습니다.");
        // 탕 끓이는 시간 30분으로 설정
        super.cookTime += 30;
    }
 
    public int cooking() {
        super.cookTime = super.cooking();
        putIngredient();
        boilSoup();
        System.out.println("조리가 완료되었습니다.");
        return super.cookTime;
    }
 
    public void moreTime() {
        // 탕 음식 +10분
        super.cookTime += 10;
    }
 
    public void showInfo() {
        super.showInfo();
        System.out.println("선택하신 음식 종류: 밥류");
        System.out.print("탕 재료: ");
        printIngredient();
        System.out.println();
        System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
    }
 
    public String getSoupSauce() {
        return soupSauce;
    }
 
    public void setSoupSauce(String soupSauce) {
        this.soupSauce = soupSauce;
    }
 
}
 
