package Player;

//import java.util.Scanner;

public class Goblin extends NonHuman {
	public Goblin(String name) {
		super(name);
		this.character = "������";
		this.setPower(20);
		this.hp = 100;
	}

//	public void attack(Player target) {
//		System.out.println("=== " + this.name + " ===");
//		Scanner scan = new Scanner(System.in);
//		int menu;
//		System.out.println("����� �ɷ��� ���ÿ�.");
//		System.out.println("1. ����� �ɷ�");
//		System.out.println("2. ���� �ɷ�");
//		System.out.print(">>");
//		menu = scan.nextInt();
//		if (menu == 1)
//			bat(target);
//		else
//			super.attack(target);
////		scan.close();
//		System.out.println();
//	}

//	public void bat(Player target) {
//		System.out.println("�١ڡ١ڡ� "+target.name + " ������ ���� �١ڡ١ڡ�");
//		target.hp -= target.getPower();
//	}

	public String bat(Player target) {
//		System.out.println("�١ڡ١ڡ� "+target.name + " ������ ���� �١ڡ١ڡ�");
		target.hp -= target.getPower();
		return ("�١ڡ١ڡ� "+target.name + " ������ ���� �١ڡ١ڡ�");
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("���� �ɷ� : ������ ����̸� ����ϸ� ������ �����θ� �����մϴ�.");
		System.out.println("==============");
	}
}
