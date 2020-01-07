public class 미스터피자 extends 양식집 {

	public String ingredientType = "베이컨";
	public 미스터피자() {
		super.name = "포테이토피자";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime = super.cooking();
		chop();
		makeSource();
		return super.cookTime;
	}

	public void chop() {
		System.out.println(this.ingredientType + "을(를) 자르고 있습니다.");
		super.cookTime += 10;
	}

	public void makeSource() {
		System.out.println(this.ingredientType + "을(를) 가열하고 있습니다.");
		// 면을 끓이는 시간 +10분
		super.cookTime += 10;
		
	}
	
	

}
