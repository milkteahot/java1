public class ��ȭ�� extends �߽��� implements ��丮�Ҽ��ִ� {

	public String noodleType = "��Ÿ��";
	public String extraSauce = "�������� ¥��ҽ�";

	public ��ȭ��() {
		super.name = "¥���";
		super.price = 7000;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		makeSauce();
		super.pourOil();
		makeNoodle();
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "��(��) ���̰� �ֽ��ϴ�.");
		// ���� ���̴� �ð� +10��
		super.cookTime += 10;
	}

	public void makeSauce() {
		System.out.println(this.extraSauce + "��(��) ����ϴ�.");
		// ¥��ҽ� ����� �ð� +20��
		super.cookTime += 20;
	}

	public void makeNoodle() {
		System.out.println(this.name + "��(��) ����� �ֽ��ϴ�.");
		// ����� �ð� +20��
		super.cookTime += 20;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�� ����: " + this.noodleType);
		System.out.println("�߰� �ҽ�: " + this.extraSauce);
		System.out.println("�ֹ� �� ��ޱ��� �ɸ� �� �ð�: " + super.serveTime);
	}
}
