package Weapon;

import Player.Player;
import Player.Vampire;

public class Gun extends Weapon {
    private int bulletNum;

    public void attack(Player target){
    	shoot(target);
    	
    }

    public void shoot(Player target){
    	System.out.println(target.name+"이 총에 맞았습니다. 체력이 40 감소합니다.");
    	target.hp -= 40;
    }

    public void silverShoot(Vampire target){
    	//if(target.name == Vampire) target.hp -= 50;
    }

}
