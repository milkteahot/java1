package Model;

public class NonHuman extends Player {
	
	public NonHuman(String name) {
		this.hp = 70;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("상태");
	}
}