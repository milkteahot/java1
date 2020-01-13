package Weapon;

import Player.Player;

public class Sword extends Weapon {

    public void attack(Player target){
    	stab(target);
    }

    public void stab(Player target){
    	System.out.println(target.name+"이 칼에 찔렸습니다. 체력이 20 감소합니다.");
    	target.hp -= 20;
    }

}
