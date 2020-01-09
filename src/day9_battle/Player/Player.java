package Player;
import Interface.Attackable;
import Weapon.Weapon; //package.class

public class Player implements Attackable {
    public String �̸�;
    private int power;
    public int hp;
    public Weapon ����;

    //constructor - return type x
    public Player() {} //�⺻������!
    
    public Player(String �̸�	, int hp, int power) {
    	this.�̸� = �̸�;
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
    	System.out.println("�̸�: "+ this.�̸� + "("+ this.power+")");
    	System.out.print("hp: ");
    	for(int i=0;i<this.hp;i++) 
    		System.out.print("��"); //println x
    	
    	System.out.println("("+this.hp+")");
    	
    }
    
	public void �����ϱ�(){
		System.out.println(this.�̸� + "�� �����մϴ�.");
    }

    public void �����ϱ�(Player target){
    	System.out.println(">>>"+this.�̸� + "=========>"+ target.�̸�);
    	target.hp -= this.power;
    }

	@Override
	public void attack1() {
		// TODO Auto-generated method stub
		
	}

}
