package Weapon;

import Player.Player;

public class Grenade extends Weapon {
	
	public void target (String name) {
		this.name = name;
	}

    public void attack(Player target){
    	throw1(target);
    }

    public void throw1(Player target){
    	System.out.println(target.name+ "�� ����ź�� �¾ҽ��ϴ�. ü���� 50 �����մϴ�.");
    	
    }

}
