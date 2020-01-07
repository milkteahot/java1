public class 이화성 extends 중식집 implements 면요리할수있는 {

	public String noodleType = "수타면";
	public String extraSauce = "춘장으로 짜장소스";

	public 이화성() {
		super.name = "짜장면";
		super.price = 7000;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		makeSauce();
		super.pourOil();
		makeNoodle();
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "을(를) 끓이고 있습니다.");
		// 면을 끓이는 시간 +10분
		super.cookTime += 10;
	}

	public void makeSauce() {
		System.out.println(this.extraSauce + "을(를) 만듭니다.");
		// 짜장소스 만드는 시간 +20분
		super.cookTime += 20;
	}

	public void makeNoodle() {
		System.out.println(this.name + "을(를) 만들고 있습니다.");
		// 만드는 시간 +20분
		super.cookTime += 20;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("면 종류: " + this.noodleType);
		System.out.println("추가 소스: " + this.extraSauce);
		System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
	}
}
