package Weapon;

import Player.Player;
import Player.Vampire;

public class Gun extends Weapon {
    private int bulletNum;

    public void attack(Player target){
    	shoot(target);
    	
    }

    public void shoot(Player target){
    	System.out.println(target.name+"�� �ѿ� �¾ҽ��ϴ�. ü���� 40 �����մϴ�.");
    	target.hp -= 40;
    }

    public void silverShoot(Vampire target){
    	//if(target.name == Vampire) target.hp -= 50;
    }

}
