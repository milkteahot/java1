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

		System.out.print(target.name + "���� ���� �ֹ��� �̴ϴ�. ");
		System.out.println("�ƹٴ� �ɴٺ��(Avada Kedabra)!");
		target.isCursed = true;
		this.setLimit(getLimit() - 1);
	}
}
