public class 신의주찹쌀순대 extends 한식집 {

	public 신의주찹쌀순대() {
		super.name = "순대국";
		super.price = 8000;
	}
	
	public int cooking() {
		super.cookTime=super.cooking();
		super.boilSoup();
		super.cookRice();
		this.seasoning();
		System.out.println("조리가 완료되었습니다.");
		return super.cookTime;
	}
	
	public void boilSoup() {
		System.out.println(this.name + "을(를) 만들고 있습니다.");
		// 만드는 시간 +25분
		super.cookTime += 30;
	}
	
	public void seasoning() {
		System.out.println("양념을 뿌립니다.");
		super.cookTime += 3;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("선택하신 음식 종류: 밥류");
		super.serveTime = super.cookTime+super.deliverTime;
		System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
	}

}
