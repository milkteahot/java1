public class ȫ����� extends �߽��� implements ��丮�Ҽ��ִ� {

	public String noodleType = "�쵿��";

	public ȫ�����() {
		super.name = "�ſ� «��";
		super.price = 6500;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		makeBroth();
		super.pourOil();
		makeNoodle();
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "��(��) ���̰� �ֽ��ϴ�.");
		// ���� ���̴� �ð� +10��
		super.cookTime += 10;
	}

	public void makeBroth() {
		System.out.println(this.name + "�� �ſ� ������ ���� �ֽ��ϴ�.");
		// �ſ� ���� ���� �ð� +30��
		super.cookTime += 30;
	}

	public void makeNoodle() {
		System.out.println(this.name + "��(��) ����� �ֽ��ϴ�.");
		// ����� �ð� +20��
		super.cookTime += 15;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�� ����: " + this.noodleType);
		System.out.println("�ֹ� �� ��ޱ��� �ɸ� �� �ð�: " + super.serveTime);
	}
}
