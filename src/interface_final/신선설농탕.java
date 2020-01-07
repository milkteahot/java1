public class 신선설농탕 extends 한식집 {
	
	public 신선설농탕() {
		super.name = "설렁탕";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime=super.cooking();
		this.boilSoup();
		super.cookRice();
		this.pa();
		System.out.println("조리가 완료되었습니다.");
		return super.cookTime;
	}
	
	public void boilSoup() {
		System.out.println(this.name + "을(를) 만들고 있습니다.");
		// 만드는 시간 +25분
		super.cookTime += 30;
	}
	
	public void pa() {
		System.out.println("파를 뿌립니다.");
		super.cookTime += 3;
	}
	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("선택하신 음식 종류: 밥류");
		super.serveTime = super.cookTime+super.deliverTime;
		System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
	}

}
