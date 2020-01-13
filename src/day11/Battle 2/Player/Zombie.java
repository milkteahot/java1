package Player;

import Interface.Revivable;
import Weapon.Weapon;

public class Zombie extends HalfHuman implements Revivable {
	private Weapon weapon;

	public Zombie(String name, Weapon weapon) {
		super(name);
		this.character = "����";
		super.setFigure("human");
		super.setStrikingPower(5);
		super.setDefensivePower(5);
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void revive() {
		System.out.println("����� ��Ȱ�մϴ�.");
		super.setFigure("zombie");
		this.hp = 50;
		super.setStrikingPower(30);
		super.setDefensivePower(30);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�ΰ��� ���� ����: " + this.weapon.name);
	}
}
