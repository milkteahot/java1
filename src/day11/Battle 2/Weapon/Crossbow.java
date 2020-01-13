package Weapon;

import Player.Player;

public class Crossbow extends Weapon {
    private int arrowNum;

    public void attack(){
    	shoot(null);
    }

    public void shoot(Player target){
    	System.out.println(target.name+"�� ȭ���� �½��ϴ�. ü���� 30 �����մϴ�.");
    	target.hp -= 30;
    }

}
