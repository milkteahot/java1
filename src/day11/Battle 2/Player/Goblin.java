package Player;

public class Goblin extends NonHuman {
	public Goblin(String name) {
		super(name);
		this.character = "������";
		super.setStrikingPower(50);
		super.setDefensivePower(0);
	}

	public void bat(Player[] target, int index1, int index2) {
		System.out.println(target[index1].name + "�� ������ ����̷� ���� ���� ���� �����մϴ�.");
		if (target[index1].getStrikingPower() - target[index2].getDefensivePower() > 0)
			target[index2].hp -= target[index1].getStrikingPower() - target[index2].getDefensivePower();
	}

	public void bat(Player target) {
		Player[] temp = new Player[1];
		temp[0] = target;
		bat(temp, 0, 0);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("���� �ɷ�: ������ ����̸� ����ϸ� ������ ���� ���� �����մϴ�.");
	}
}
