public class �ż������� extends �ѽ��� {
	
	public �ż�������() {
		super.name = "������";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime=super.cooking();
		this.boilSoup();
		super.cookRice();
		this.pa();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		return super.cookTime;
	}
	
	public void boilSoup() {
		System.out.println(this.name + "��(��) ����� �ֽ��ϴ�.");
		// ����� �ð� +25��
		super.cookTime += 30;
	}
	
	public void pa() {
		System.out.println("�ĸ� �Ѹ��ϴ�.");
		super.cookTime += 3;
	}
	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�����Ͻ� ���� ����: ���");
		super.serveTime = super.cookTime+super.deliverTime;
		System.out.println("�ֹ� �� ��ޱ��� �ɸ� �� �ð�: " + super.serveTime);
	}

}
