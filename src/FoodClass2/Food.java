public class Food {
    // 음식 이름
    public String name;
    // 주재료
    private String mainIngredient;
    // 양(인분)
    public int amount;
    // 가격(1인분 당 가격)
    public int price;
    // 배달 시간(기본 50분으로 설정)
    // 탕을 주문할 경우 +10분, 5인분 이상 주문할 경우 +10분으로 계산
    public int deliverTime = 50;
    // 조리 시간(음식에 따라 다르게 설정)
    public int cookTime = 0;
    // 주문에서 조리, 배달까지 완료되는 시간
    public int serveTime;
 
    public Food(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
 
    public void ordered() {
        System.out.println("==============================");
        System.out.println("음식이 주문되었습니다.");
        System.out.println("100분이 초과될 경우 요금을 받지 않습니다.");
        System.out.println("==============================");
    }
 
    public void moreThan5() {
        // 5인분 이상 +20분
        if (this.amount >= 5)
            this.cookTime += 20;
    }
 
    public int cooking() {
        System.out.println("=========== 조리 정보 ===========");
        System.out.println("음식 " + this.name + "이(가) 조리 중입니다.");
        moreThan5();
        return cookTime;
    }
 
    public int delivering() {
        System.out.println("=========== 배달 정보 ===========");
        System.out.println("음식" + this.name + "이(가) 배달 중입니다.");
        System.out.println("배달 시간은 " + this.deliverTime + "분이 걸립니다.");
        return deliverTime;
    }
 
    public void showInfo() {
        System.out.println("=========== 음식 정보 ===========");
        System.out.println("이름: " + this.name);
        System.out.println("주재료: " + mainIngredient);
        System.out.println("가격대: " + price);
        System.out.println("양(인분: " + this.amount);
    }
 
    // Getter & Setter
    public String getMainIngredient() {
        return mainIngredient;
    }
 
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
