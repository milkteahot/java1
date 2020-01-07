public class 홍콩반점 extends 중식집 implements 면요리할수있는 {

	public String noodleType = "우동면";

	public 홍콩반점() {
		super.name = "매운 짬뽕";
		super.price = 6500;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		makeBroth();
		super.pourOil();
		makeNoodle();
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "을(를) 끓이고 있습니다.");
		// 면을 끓이는 시간 +10분
		super.cookTime += 10;
	}

	public void makeBroth() {
		System.out.println(this.name + "의 매운 육수를 내고 있습니다.");
		// 매운 육수 내는 시간 +30분
		super.cookTime += 30;
	}

	public void makeNoodle() {
		System.out.println(this.name + "을(를) 만들고 있습니다.");
		// 만드는 시간 +20분
		super.cookTime += 15;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("면 종류: " + this.noodleType);
		System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
	}
}
