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
		System.out.print("�����ο��� ��� �ֹ��� �̴ϴ�. ");
		System.out.println("���̺� �̴Ϲ���(Cave Inimicum)!");
		this.setLimit(this.getLimit() - 1);
	}
}
