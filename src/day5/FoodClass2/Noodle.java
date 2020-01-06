public class Noodle extends Food {
    // 면류 가격은 8000원으로 설정
    public int price = 8000;
    // 면 종류
    public String noodleType = "수타면";
    // 1인분 당 무게
    private int gPerAmount = 200;
    // 고명
    public String[] garnish = { "통깨", "단무지" };
 
    public Noodle(String name, int amount) {
        super(name, amount);
        super.setMainIngredient("면");
    }
 
    public void boilNoodle() {
        System.out.println(this.noodleType + "을(를) " + this.gPerAmount + "g 넣습니다.");
        // 면 끓이는 시간 10분으로 설정
        super.cookTime += 10;
    }
 
    public void makeBroth() {
        System.out.println("면이 들어갈 육수를 냅니다.");
        // 육수 내는 시간 15분으로 설정
        super.cookTime += 15;
    }
 
    public void printGarnish() {
        if (garnish != null) {
            for (int i = 0; i < garnish.length; i++) {
                System.out.print(garnish[i]);
                if (i != garnish.length - 1)
                    System.out.print(", ");
            }
        }
    }
 
    public void putGarnish() {
        printGarnish();
        System.out.println("이 고명으로 올라갑니다.");
        // 고명 올리는 시간 5분으로 설정
        super.cookTime += 10;
    }
 
    public int cooking() {
        super.cookTime = super.cooking();
        makeBroth();
        boilNoodle();
        putGarnish();
        return super.cookTime;
    }
 
    public void showInfo() {
        super.showInfo();
        System.out.println("선택하신 음식 종류: 면류");
        System.out.print("고명: ");
        printGarnish();
        System.out.println();
        System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
    }
 
    public int getgPerAmount() {
        return gPerAmount;
    }
 
    public void setgPerAmount(int gPerAmount) {
        this.gPerAmount = gPerAmount;
    }
 
}
 
