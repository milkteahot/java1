public class ���������Ҽ��� extends �ѽ��� {

	public ���������Ҽ���() {
		super.name = "���뱹";
		super.price = 8000;
	}
	
	public int cooking() {
		super.cookTime=super.cooking();
		super.boilSoup();
		super.cookRice();
		this.seasoning();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		return super.cookTime;
	}
	
	public void boilSoup() {
		System.out.println(this.name + "��(��) ����� �ֽ��ϴ�.");
		// ����� �ð� +25��
		super.cookTime += 30;
	}
	
	public void seasoning() {
		System.out.println("����� �Ѹ��ϴ�.");
		super.cookTime += 3;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�����Ͻ� ���� ����: ���");
		super.serveTime = super.cookTime+super.deliverTime;
		System.out.println("�ֹ� �� ��ޱ��� �ɸ� �� �ð�: " + super.serveTime);
	}

}
