package Player;

//import java.util.Scanner;

public class Vampire extends NonHuman {
	public Vampire(String name) {
		super(name);
		this.character = "������";
		this.setPower(15);
		this.hp = 100;
	}

//	public void attack(Player target) {
//		System.out.println("=== " + this.name + " ===");
//		Scanner scan = new Scanner(System.in);
//		int menu;
//		System.out.println("����� �ɷ��� ���ÿ�.");
//		System.out.println("1. �� ��� �ɷ� ");
//		System.out.println("2. ���� �ɷ�");
//		System.out.print(">>");
//		menu = scan.nextInt();
//		if (menu == 1)
//			absorbHp(target);
//		else
//			super.attack(target);
////		scan.close();
//		System.out.println();
//	}

//	public void absorbHp(Player target) {
//		System.out.println(this.name + " <=== �� ��� === " + target.name);
//		if (target.hp >= 20) {
//			target.hp -= 20;
//			this.hp += 20;
//		} else {
//			this.hp += target.hp;
//			target.hp = 0;
//		}
//	}

	public String absorbHp(Player target) {
//		System.out.println(this.name + " <=== �� ��� === " + target.name);
		if (target.hp >= 15) {
			target.hp -= 15;
			this.hp += 15;
		} else {
			this.hp += target.hp;
			target.hp = 0;
		}
		return (this.name + " <=== �� ��� === " + target.name);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("���� �ɷ�: ���� �Ǹ� ����� �� �ֽ��ϴ�.");
		System.out.println("==============");
	}

}
