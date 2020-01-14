package Model;

//import java.util.Scanner;

public class Vampire extends NonHuman {
	public Vampire(String name) {
		super(name);
		this.character = "도깨비";
		this.setPower(15);
		this.hp = 100;
	}

//	public void attack(Player target) {
//		System.out.println("=== " + this.name + " ===");
//		Scanner scan = new Scanner(System.in);
//		int menu;
//		System.out.println("사용할 능력을 고르시오.");
//		System.out.println("1. 피 흡수 능력 ");
//		System.out.println("2. 공격 능력");
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
//		System.out.println(this.name + " <=== 피 흡수 === " + target.name);
//		if (target.hp >= 20) {
//			target.hp -= 20;
//			this.hp += 20;
//		} else {
//			this.hp += target.hp;
//			target.hp = 0;
//		}
//	}

	public String absorbHp(Player target) {
//		System.out.println(this.name + " <=== 피 흡수 === " + target.name);
		String msg = this.name + " <=== 피 흡수 === " + target.name;
		return msg;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("고유 능력: 상대방 피를 흡수할 수 있습니다.");
		System.out.println("==============");
	}

}
