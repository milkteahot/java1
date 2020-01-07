public class 양식집 extends 음식점 {

	public void fan() {
		System.out.println("팬에 열을 가합니다.");
		super.cookTime += 5;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("선택하신 음식 종류: 양식");
	}

}
