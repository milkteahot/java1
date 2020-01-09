package Player;
import Interface.Attackable;
import Weapon.Weapon; //package.class

public class Player implements Attackable {
    public String 이름;
    private int power;
    public int hp;
    public Weapon 무기;

    //constructor - return type x
    public Player() {} //기본생성자!
    
    public Player(String 이름	, int hp, int power) {
    	this.이름 = 이름;
    	this.hp = hp;
    	this.power = power;
	}
    
    //getter, setter
    public int getPower() {
    	return this.power;
    }
    public void setPower(int power) {
    	this.power = power;
    }    
    

    //method
    public void showStatus() {
    	System.out.println("==============================");
    	System.out.println("이름: "+ this.이름 + "("+ this.power+")");
    	System.out.print("hp: ");
    	for(int i=0;i<this.hp;i++) 
    		System.out.print("■"); //println x
    	
    	System.out.println("("+this.hp+")");
    	
    }
    
	public void 공격하기(){
		System.out.println(this.이름 + "이 공격합니다.");
    }

    public void 공격하기(Player target){
    	System.out.println(">>>"+this.이름 + "=========>"+ target.이름);
    	target.hp -= this.power;
    }

	@Override
	public void attack1() {
		// TODO Auto-generated method stub
		
	}

}
