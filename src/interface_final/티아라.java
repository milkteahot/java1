public class 티아라 extends 양식집 implements 면요리할수있는{
	
	public String sourceType = "토마토";
	public 티아라() {
		super.name = "파스타";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime = super.cooking();
		chop();
		makeSource();
		super.fan();
		return super.cookTime;
	}

	public void chop() {
		System.out.println(this.sourceType + "을(를) 자르고 있습니다.");
		super.cookTime += 10;
	}

	public void makeSource() {
		System.out.println(this.sourceType + "을(를) 끓이고 있습니다.");
		// 면을 끓이는 시간 +10분
		super.cookTime += 10;
		
	}
	@Override
	public void boilNoodle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void makeNoodle() {
		// TODO Auto-generated method stub
		
	}
	

}
