package Weapon;

import Interface.Attackable;
import Player.Player;

public class Weapon implements Attackable {

	public String name;
	private int power = 20;

	public void attack() {
	}

	public void attack(String name, int power, Player target) {
		this.name = name;
		this.power = power;

		System.out.println(this.name + "�� ���⸦ " + target.name + "���� ����߽��ϴ�. \n���ݷ��� " + this.power + "�Դϴ�.");
		System.out.println(target.name + "�� ���� ü���� " + target.hp + "�Դϴ�.");
	}

	public void attack(Player[] target, int index) {
		// TODO Auto-generated method stub

	}

	public void attack(Player target) {

		System.out.println(this.name + "�� ���⸦ " + target.name + "���� ����߽��ϴ�. \n���ݷ��� " + this.power + "�Դϴ�.");
		System.out.println(target.name + "�� ���� ü���� " + target.hp + "�Դϴ�.");

	}

}
