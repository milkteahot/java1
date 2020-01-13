package Weapon;

import Player.Player;

public class Crossbow extends Weapon {
    private int arrowNum;

    public void attack(){
    	shoot(null);
    }

    public void shoot(Player target){
    	System.out.println(target.name+"이 화살을 맞습니다. 체력이 30 감소합니다.");
    	target.hp -= 30;
    }

}
