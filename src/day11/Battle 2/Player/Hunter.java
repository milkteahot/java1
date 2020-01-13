package Player;

import Weapon.Weapon;

public class Hunter extends Human {
	private Weapon[] weapons = new Weapon[2];

	public Hunter(String name, Weapon[] weapons) {
		super(name);
		this.character = "ÇåÅÍ";
		this.weapons = weapons;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("¹«±â: " + weapons[0] + ", " + weapons[1]);
	}
	
	public void attack(Player target) {
		weapons[0].attack(target);
	}
}
