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
		System.out.print("치유 능력의 범위를 설정하세요.");
		
	}
	
	public void healSelf() {
		System.out.println("스스로를 치료합니다.");
		System.out.println("에피스키(Episki)!");
	}

	public void healTeam(Player team[]) {
		System.out.println("팀 전체를 치료합니다.");
		System.out.println("볼메라 사멘투르(Volmera Samentur)!");
	}

	public void healTeamMember(Player member) {
		System.out.println(member.name + "을(를) 치료합니다.");
		System.out.println("브래키움 엠멘도(Brakium Ememdo)!");
		member.hp += 20;
	}
}
