public class 음식점 implements 주문받을수있는 {
	public int price;
	public String name;
	public int amount;
	public int cookTime;
	public int deliverTime = 40;
	public int serveTime;
	
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
		return this.cookTime;
	}
	
	public int delivering() {
		System.out.println("=========== 배달 정보 ===========");
		System.out.println("음식" + this.name + "이(가) 배달 중입니다.");
		System.out.println("배달 시간은 " + this.deliverTime + "분이 걸립니다.");
		return this.deliverTime;
	}
	
	public void showInfo() {
		System.out.println("=========== 음식 정보 ===========");
		System.out.println("이름: " + this.name);
		System.out.println("가격대: " + price);
		System.out.println("양(인분): " + this.amount);
	}
}
