package Main;

import java.util.ArrayList;
import java.util.Random;

import Player.Goblin;
import Player.Human;
import Player.Hunter;
import Player.Magician;
import Player.NonHuman;
import Player.Player;
import Player.Vampire;
import Weapon.Gun;

public class TeamFight {

	public static void main(String[] args) throws InterruptedException {

		Player[] vamTeam = { new Vampire("뱀파이어1"), new Vampire("뱀파이어2"), new Vampire("뱀파이어3") };
		Player[] dokTeam = { new Goblin("도깨비1"), new Goblin("도깨비2"), new Goblin("도깨비3") };

		// 플레이어 어레이 리스트 만들기
		ArrayList<Player> team1 = new ArrayList<Player>();
		ArrayList<Player> team2 = new ArrayList<Player>();
		setPlayerList(team1, vamTeam);
		setPlayerList(team2, dokTeam);

		Random r = new Random();
		int num;
//		int round = 1;
		// while문 안에서 누가 먼저 공격할 것인지 
		Player attacker, target;

		while (true) {
			// hp가 음수가 되면 팀에서 빠짐
			for (int i = 0; i < team1.size(); i++) {
				if (team1.get(i).hp < 0)
					team1.remove(i);
			}
			for (int i = 0; i < team2.size(); i++) {
				if (team2.get(i).hp < 0)
					team2.remove(i);
			}
			if (team1.isEmpty() == true || team2.isEmpty() == true)
				break;

			num = r.nextInt();
			// 팀 중 누가 공격에 나설 것인지 고르기
			int whoA = r.nextInt() % team1.size();
			int whoB = r.nextInt() % team2.size();
			if (whoA < 0)
				whoA *= -1;
			if (whoB < 0)
				whoB *= -1;

			if (num % 2 == 0) {
				attacker = team1.get(whoA);
				target = team2.get(whoB);
				attacker.attack(target);
				target.attack(attacker);
			} else {
				attacker = team1.get(whoA);
				target = team2.get(whoB);
				attacker.attack(target);
				target.attack(attacker);
			}
			
			attacker.showStatus();
			target.showStatus();
			
			Thread.sleep(2000);
//			round++;
		}

		if (team1.isEmpty())
			System.out.println("도깨비 승");
		else
			System.out.println("뱀파이어 승");
	}

	// 어레이 리스트 안에 플레이어 배열 넣기
	public static void setPlayerList(ArrayList<Player> team1, Player[] playerTeam) {
		for (int i = 0; i < playerTeam.length; i++) {
			team1.add(playerTeam[i]);
		}
	}
}
