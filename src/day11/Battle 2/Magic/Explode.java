package Magic;

public class Explode extends Magic {
	public int explosionPower = 20;

	public Explode() {
		super();
		this.setLimit(1);
	}

	public void explodeSpell() {
		System.out.print("상대팀에게 폭파 주문을 겁니다. ");
		System.out.println("봄바르다 맥시마(Bombarda Maxima)!");
		this.setLimit(getLimit() - 1);
	}
}
