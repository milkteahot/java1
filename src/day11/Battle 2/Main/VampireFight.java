package Main;

import java.util.Random;

import Player.Vampire;

public class VampireFight {

	public static void main(String[] args) throws InterruptedException {
		Vampire bella = new Vampire("벨라");
		Vampire edward = new Vampire("에드워드");
		bella.hp = 100;
		edward.hp = 100;
		bella.setDefensivePower(5);
		edward.setDefensivePower(15);
		bella.setStrikingPower(30);
		edward.setStrikingPower(10);
		edward.showStatus();
		bella.showStatus();

		Random r = new Random();
		int num;
		int round = 1;
		System.out.println("10라운드가 되면 싸움을 종료합니다.");

		while (true) {
			if (bella.hp <= 0 || edward.hp <= 0 || round > 10)
				break;
			num = r.nextInt();

			System.out.println("ROUND " + round);
			if (num % 2 == 0) {
				bella.attack(edward);
				edward.attack(bella);
			} else {
				edward.attack(bella);
				bella.attack(edward);
			}

			bella.showStatus();
			edward.showStatus();

			Thread.sleep(2000);
			round++;
		}

		if (bella.hp >= 0) {
			if(edward.hp >=0)
				System.out.println("Draw!");
			else
				System.out.println(bella.name + " Win!!");				
		}
		else
			System.out.println(edward.name + " Win!!");
	}
}
