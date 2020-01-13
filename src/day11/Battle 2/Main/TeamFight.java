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

		Player[] vamTeam = { new Vampire("�����̾�1"), new Vampire("�����̾�2"), new Vampire("�����̾�3") };
		Player[] dokTeam = { new Goblin("������1"), new Goblin("������2"), new Goblin("������3") };

		// �÷��̾� ��� ����Ʈ �����
		ArrayList<Player> team1 = new ArrayList<Player>();
		ArrayList<Player> team2 = new ArrayList<Player>();
		setPlayerList(team1, vamTeam);
		setPlayerList(team2, dokTeam);

		Random r = new Random();
		int num;
//		int round = 1;
		// while�� �ȿ��� ���� ���� ������ ������ 
		Player attacker, target;

		while (true) {
			// hp�� ������ �Ǹ� ������ ����
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
			// �� �� ���� ���ݿ� ���� ������ ����
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
			System.out.println("������ ��");
		else
			System.out.println("�����̾� ��");
	}

	// ��� ����Ʈ �ȿ� �÷��̾� �迭 �ֱ�
	public static void setPlayerList(ArrayList<Player> team1, Player[] playerTeam) {
		for (int i = 0; i < playerTeam.length; i++) {
			team1.add(playerTeam[i]);
		}
	}
}
