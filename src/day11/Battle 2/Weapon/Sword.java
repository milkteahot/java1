package Weapon;

import Player.Player;

public class Sword extends Weapon {

    public void attack(Player target){
    	stab(target);
    }

    public void stab(Player target){
    	System.out.println(target.name+"�� Į�� ��Ƚ��ϴ�. ü���� 20 �����մϴ�.");
    	target.hp -= 20;
    }

}
