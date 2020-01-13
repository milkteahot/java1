package Player;

public class Human extends Player {

	public Human(String name) {
		super(name);
		this.hp = 100;
		super.setStrikingPower(5);
		super.setDefensivePower(5);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("분류: 인간");
	}
}
