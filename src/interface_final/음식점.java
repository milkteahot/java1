public class ������ implements �ֹ��������ִ� {
	public int price;
	public String name;
	public int amount;
	public int cookTime;
	public int deliverTime = 40;
	public int serveTime;
	
	public void ordered() {
		System.out.println("==============================");
		System.out.println("������ �ֹ��Ǿ����ϴ�.");
		System.out.println("100���� �ʰ��� ��� ����� ���� �ʽ��ϴ�.");
		System.out.println("==============================");
	}
	
	public void moreThan5() {
		// 5�κ� �̻� +20��
		if (this.amount >= 5)
			this.cookTime += 20;
	}
	
	public int cooking() {
		System.out.println("=========== ���� ���� ===========");
		System.out.println("���� " + this.name + "��(��) ���� ���Դϴ�.");
		moreThan5();
		return this.cookTime;
	}
	
	public int delivering() {
		System.out.println("=========== ��� ���� ===========");
		System.out.println("����" + this.name + "��(��) ��� ���Դϴ�.");
		System.out.println("��� �ð��� " + this.deliverTime + "���� �ɸ��ϴ�.");
		return this.deliverTime;
	}
	
	public void showInfo() {
		System.out.println("=========== ���� ���� ===========");
		System.out.println("�̸�: " + this.name);
		System.out.println("���ݴ�: " + price);
		System.out.println("��(�κ�): " + this.amount);
	}
}
