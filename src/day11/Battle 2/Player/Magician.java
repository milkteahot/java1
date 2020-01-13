package Player;

import Magic.*;

public class Magician extends Human {
	public Magic[] magics = { new Poison(), new Invisible(), new Curse(), new Heal(), new Explode(), new Defend() };
	private String specialAbility;

	public Magician(String name, String specialAbility) {
		super(name);
		this.character = "마법사";
		this.specialAbility = specialAbility;
	}

	public String getSpecialAbility() {
		return specialAbility;
	}

	public void setSpecialAbility(String specialAbility) {
		this.specialAbility = specialAbility;
	}

	public void magic(Player[] target, int index, int magicIndex) {
		System.out.print(this.name + "이 ");
		magics[magicIndex + 1].spell(target[index]);
		if (magicIndex == 5)
			this.setDefensivePower(30);
		if (magicIndex == 4)
			for(int i=0;i<target.length;i++) {
				
			}
				
		
	}

	public void specialize() {
		switch (this.specialAbility) {
		case "Poison":
			magics[0].setLimit(5);
			break;
		case "Invisible":
			magics[1].setLimit(3);
			break;
		case "Curse":
			magics[2].setLimit(5);
			break;
		case "Heal":
			magics[3].setLimit(2);
			break;
		case "Explode":
			magics[4].setLimit(2);
			break;
		case "Defend":
			magics[5].setLimit(4);
			break;
		}
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("특화 능력: " + this.specialAbility);
	}
}
