package Player;

public class Player{
	public String character;
	public String name;
	private int power;
	public int hp;

	public Player(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String attack(Player target) {
//		System.out.println(this.name + " ===> ���� ===> " + target.name);
		target.hp -= this.getPower();
//		System.out.println();
		return (this.name + " ===> ���� ===> " + target.name);
	}

	public void showStatus() {
		System.out.println("==============");
		System.out.print(this.name + " ");
		for (int i = 0; i < this.hp; i++) {
			System.out.print("��");
		}
		System.out.println("(" + this.hp + ")");
		System.out.println("==============");
	}

	public void showInfo() {
		System.out.println();
		System.out.println("==============");
		System.out.println("ĳ���� : " + this.character);
		System.out.println("���� hp : "+this.hp);
		System.out.println("���� ���ݷ�: " + this.getPower());
	}

	public String bat(Player target) {
		return "";
	}

	public String absorbHp(Player target) {
		return "";
	}
	
}
