package Player;

import Interface.Revivable;
import Weapon.Weapon;

public class Werewolf extends HalfHuman implements Revivable {
	private Weapon weapon;

	public Werewolf(String name, Weapon weapon) {
		super(name);
		this.character = "�����ΰ�";
		super.setFigure("wolf");
		super.setStrikingPower(30);
		super.setDefensivePower(20);
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void revive() {
		System.out.println("�ΰ����� ��Ȱ�մϴ�.");
		super.setFigure("human");
		this.hp = 70;
		super.setStrikingPower(5);
		super.setDefensivePower(5);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�ΰ��� ���� ����: " + this.weapon.name);
	}

}
