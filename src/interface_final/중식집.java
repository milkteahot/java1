public class 중식집 extends 음식점 {

	public String country = "중국";

	public void pourOil() {
		System.out.println(super.name + "에 기름을 붓습니다.");
		// 기름 붓는 시간 +5분
		super.cookTime += 5;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("선택하신 음식 종류: 중식");
	}
	
}
