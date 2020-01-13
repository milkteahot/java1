package Main;

import java.util.Random;

import Player.Goblin;
import Player.Vampire;

public class NonHumanFight {

	public static void main(String[] args) throws InterruptedException {
		Goblin kimShin = new Goblin("김신");
		Vampire edward = new Vampire("에드워드");

		kimShin.showInfo();
		edward.showInfo();
		Random r = new Random();
		int num, num2;
		int round = 1;
		System.out.println("10라운드가 되면 싸움을 종료합니다.");

		while (true) {
			if (kimShin.hp <= 0 || edward.hp <= 0 || round > 10)
				break;
			System.out.println("ROUND " + round);
			// 누가 먼저 공격할지
			num = r.nextInt();
			if (num % 2 == 0) {
				// 뱀파이어 먼저
				num2 = r.nextInt();
				if (num2 % 3 == 0)
					edward.absorbHp(kimShin);
				else
					edward.attack(kimShin);
				num2 = r.nextInt();
				if (num2 % 3 == 0)
					kimShin.bat(edward);
				else
					kimShin.attack(edward);
			} else {
				// 도깨비 먼저
				num2 = r.nextInt();
				if (num2 % 3 == 0)
					kimShin.bat(edward);
				else
					kimShin.attack(edward);
				num2 = r.nextInt();
				if (num2 % 3 == 0)
					edward.absorbHp(kimShin);
				else
					edward.attack(kimShin);
			}

			kimShin.showStatus();
			edward.showStatus();

			Thread.sleep(2000);
			round++;
		}

		if (edward.hp >= 0) {
			if (kimShin.hp >= 0)
				System.out.println("Draw!");
			else
				System.out.println(edward.name + " Win!");
		} else
			System.out.println(kimShin.name + " Win!");
	}
}
