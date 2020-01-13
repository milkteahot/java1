package Player;

public class Goblin extends NonHuman {
	public Goblin(String name) {
		super(name);
		this.character = "도깨비";
		super.setStrikingPower(50);
		super.setDefensivePower(0);
	}

	public void bat(Player[] target, int index1, int index2) {
		System.out.println(target[index1].name + "은 도깨비 방망이로 인해 같은 팀을 공격합니다.");
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
		System.out.println("고유 능력: 도깨비 방망이를 사용하면 상대방이 같은 팀을 공격합니다.");
	}
}
