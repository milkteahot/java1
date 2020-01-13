package Player;

public class Vampire extends NonHuman {
	public Vampire(String name) {
		super(name);
		this.character = "뱀파이어";
		super.setStrikingPower(60);
		super.setDefensivePower(0);
	}

	public void absorbHp(Player[] target, int index) {
		System.out.println(this.name + "은 " + target[index].name + "의 피를 흡수합니다.");
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
		System.out.println("고유 능력: 상대방 피를 20 흡수합니다.");
	}

}
