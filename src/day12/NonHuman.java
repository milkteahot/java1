package Player;

public class NonHuman extends Player {
	
	public NonHuman(String name) {
		super(name);
		this.hp = 70;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�з�: ���ΰ�");
	}
}
