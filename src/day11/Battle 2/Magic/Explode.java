package Magic;

public class Explode extends Magic {
	public int explosionPower = 20;

	public Explode() {
		super();
		this.setLimit(1);
	}

	public void explodeSpell() {
		System.out.print("��������� ���� �ֹ��� �̴ϴ�. ");
		System.out.println("���ٸ��� �ƽø�(Bombarda Maxima)!");
		this.setLimit(getLimit() - 1);
	}
}
