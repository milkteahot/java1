package Magic;

public class Defend extends Magic {
	public int defensivePower = 30;
	
	public Defend() {
		super();
		this.setLimit(2);
	}
	
	public void spell() {
		defendSpell();
	}

	public void defendSpell() {
		System.out.print("스스로에게 방어 주문을 겁니다. ");
		System.out.println("케이브 이니미컴(Cave Inimicum)!");
		this.setLimit(this.getLimit() - 1);
	}
}
