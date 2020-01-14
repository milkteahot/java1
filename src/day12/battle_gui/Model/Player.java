package Model;

public class Player{
	public String character;
	public String name;
	public int power;
	public int hp;

	public Player(String name, int hp) {
		super();
		this.hp = hp;
		this.name = name;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String attack(Player target) {
//		System.out.println(this.name + " ===> 공격 ===> " + target.name);
		String msg = this.name+" ===> 공격 ===> "+target.name;
		target.hp -= this.power;
		System.out.println(this.name+" "+this.hp+" "+this.power);
		
		if(target.hp <= 0) {
			msg = target.name +"이(가) 죽었습니다.";
			System.out.println(msg);
			target = null;
		}
//		System.out.println();
		return msg;
	}

	public void showStatus() {
		System.out.println("==============");
		System.out.print(this.name + " ");
		for (int i = 0; i < this.hp; i++) {
			System.out.print("■");
		}
		System.out.println("(" + this.hp + ")");
		System.out.println("==============");
	}

	public void showInfo() {
		System.out.println();
		System.out.println("==============");
		System.out.println("캐릭터 : " + this.character);
		System.out.println("현재 hp : "+this.hp);
		System.out.println("현재 공격력: " + this.getPower());
	}

	public String bat(Player target) {
		return "";
	}

	public String absorbHp(Player target) {
		return "";
	}

	public void setHp(int i) {
		// TODO Auto-generated method stub
		
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}
	
}
