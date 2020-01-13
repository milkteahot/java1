package Player;

import Interface.Attackable;

public class Player implements Attackable {
	public String character;
	public String name;
	private int strikingPower;
	private int defensivePower;
	public int hp;
	public boolean isCursed;

	public Player(String name) {
		this.name = name;
		this.isCursed = false;
	}

	public int getStrikingPower() {
		return strikingPower;
	}

	public void setStrikingPower(int strikingPower) {
		this.strikingPower = strikingPower;
	}

	public int getDefensivePower() {
		return defensivePower;
	}

	public void setDefensivePower(int defensivePower) {
		this.defensivePower = defensivePower;
	}

	public void attack(Player[] target, int index) {
		System.out.println(this.name + "��(��) " + target[index].name + "��(��) �����մϴ�.");
		if (this.getStrikingPower() - target[index].getDefensivePower() > 0)
			target[index].hp -= this.getStrikingPower() - target[index].getDefensivePower();
	}

	public void attack(Player target) {
		Player[] temp = new Player[1];
		temp[0] = target;
		attack(temp, 0);
	}

	public void showStatus() {
		System.out.println("==============");
		System.out.println("�̸� : " + this.name);
		System.out.print("hp: ");
		for (int i = 0; i < this.hp; i++) {
			System.out.print("��");
		}
		System.out.println("(" + this.hp + ")");
	}

	public void showInfo() {
		System.out.println("==============");
		System.out.println("ĳ���� : " + this.character);
		System.out.println("���ݷ�: " + this.strikingPower);
		System.out.println("����: " + this.defensivePower);
	}

}
