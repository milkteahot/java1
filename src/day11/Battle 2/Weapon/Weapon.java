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

		System.out.println(this.name + "이 무기를 " + target.name + "에게 사용했습니다. \n공격력은 " + this.power + "입니다.");
		System.out.println(target.name + "의 현재 체력은 " + target.hp + "입니다.");
	}

	public void attack(Player[] target, int index) {
		// TODO Auto-generated method stub

	}

	public void attack(Player target) {

		System.out.println(this.name + "이 무기를 " + target.name + "에게 사용했습니다. \n공격력은 " + this.power + "입니다.");
		System.out.println(target.name + "의 현재 체력은 " + target.hp + "입니다.");

	}

}
