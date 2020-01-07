public class 리화쿵부 extends 중식집 implements 면요리할수있는 {

	public String noodleType = "마라탕면";
	public String[] soupIngredient = { "소고기", "두부", "새우", "브로콜리", "숙주나물" };

	public 리화쿵부() {
		super.name = "마라탕";
		super.price = 8000;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		super.pourOil();
		putIngredient();
		makeNoodle();
		System.out.println("조리가 완료되었습니다.");
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "을(를) 끓이고 있습니다.");
		// 면을 끓이는 시간 +17분
		super.cookTime += 17;
	}

	public void putIngredient() {
		printIngredient();
		System.out.println("을(를) 넣습니다.");
		// 재료 넣는 시간 +10분
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

	public void makeNoodle() {
		System.out.println(this.name + "을(를) 만들고 있습니다.");
		// 만드는 시간 +25분
		super.cookTime += 25;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("면 종류: " + this.noodleType);
		System.out.print("탕 재료: ");
		printIngredient();
		System.out.println();
		System.out.println("주문 후 배달까지 걸린 총 시간: " + super.serveTime);
	}
}
