package Player;

public class Vampire extends NonHuman {
	public Vampire(String name) {
		super(name);
		this.character = "�����̾�";
		super.setStrikingPower(60);
		super.setDefensivePower(0);
	}

	public void absorbHp(Player[] target, int index) {
		System.out.println(this.name + "�� " + target[index].name + "�� �Ǹ� ����մϴ�.");
		if (target[index].hp > 20) {
			this.hp += 20;
			target[index].hp -= 20;
		} else {
			this.hp += target[index].hp;
			target[index].hp = 0;
		}
	}

	public void absorbHp(Player target) {
		Player[] temp = new Player[1];
		temp[0] = target;
		absorbHp(temp, 0);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("���� �ɷ�: ���� �Ǹ� 20 ����մϴ�.");
	}

}
