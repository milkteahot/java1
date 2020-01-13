package Magic;

import Player.Player;

public class Curse extends Magic {

	public Curse() {
		super();
		this.setLimit(2);
	}
	
	public void spell(Player target) {
		curseSpell(target);
	}

	public void curseSpell(Player target) {

		System.out.print(target.name + "에게 저주 주문을 겁니다. ");
		System.out.println("아바다 케다브라(Avada Kedabra)!");
		target.isCursed = true;
		this.setLimit(getLimit() - 1);
	}
}
