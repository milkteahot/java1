package Main;

import java.util.Random;
import Player.Player;
import Weapon.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Player meme = new Player("meme", 100, 20); //name, hp, power
		Player charlie = new Player("charlie", 70, 30);
		
		Random r = new Random();
		int num;
		
		while(true) {
			//exit condition
			if(meme.hp <= 0 || charlie.hp <=0) break;
			
			//random
			num = r.nextInt();
			if (num%2 ==0) meme.공격하기(charlie); //cf) divide 3 
			else charlie.공격하기(meme);
			
			//show status
			meme.showStatus();
			charlie.showStatus();
			
			//sleep 
			Thread.sleep(1000);
			
			
		}
		
		if(meme.hp >= 0) System.out.println("meme win!");
		else System.out.println("charlie win!");
		
		
		

	}

}
