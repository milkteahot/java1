package Model;

//import java.util.Scanner;

public class Goblin extends NonHuman {
	public Goblin(String name) {
		super(name);
		this.character = "도깨비";
		this.setPower(20);
		this.hp = 100;
	}

//	public void attack(Player target) {
//		System.out.println("=== " + this.name + " ===");
//		Scanner scan = new Scanner(System.in);
//		int menu;
//		System.out.println("사용할 능력을 고르시오.");
//		System.out.println("1. 방망이 능력");
//		System.out.println("2. 공격 능력");
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
//		System.out.println("☆★☆★☆ "+target.name + " 스스로 공격 ☆★☆★☆");
//		target.hp -= target.getPower();
//	}

	public String bat(Player target) {
//		System.out.println("☆★☆★☆ "+target.name + " 스스로 공격 ☆★☆★☆");
		target.hp -= target.getPower();
		return ("☆★☆★☆ "+target.name + " 스스로 공격 ☆★☆★☆");
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("고유 능력 : 도깨비 방망이를 사용하면 상대방이 스스로를 공격합니다.");
		System.out.println("==============");
	}
}