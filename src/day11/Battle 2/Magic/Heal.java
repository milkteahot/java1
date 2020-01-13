package Magic;

import java.util.Scanner;

import Player.Player;

public class Heal extends Magic {
	private int recoveredHp;

	public int getRecoveredHp() {
		return recoveredHp;
	}

	public void setRecoveredHp(int recoveredHp) {
		this.recoveredHp = recoveredHp;
	}

	public void spell() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ġ�� �ɷ��� ������ �����ϼ���.");
		
	}
	
	public void healSelf() {
		System.out.println("�����θ� ġ���մϴ�.");
		System.out.println("���ǽ�Ű(Episki)!");
	}

	public void healTeam(Player team[]) {
		System.out.println("�� ��ü�� ġ���մϴ�.");
		System.out.println("���޶� �������(Volmera Samentur)!");
	}

	public void healTeamMember(Player member) {
		System.out.println(member.name + "��(��) ġ���մϴ�.");
		System.out.println("�귡Ű�� ���൵(Brakium Ememdo)!");
		member.hp += 20;
	}
}
