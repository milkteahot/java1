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
    	System.out.println(target.name+ "이 수류탄에 맞았습니다. 체력이 50 감소합니다.");
    	
    }

}
