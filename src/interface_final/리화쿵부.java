public class ��ȭ���� extends �߽��� implements ��丮�Ҽ��ִ� {

	public String noodleType = "��������";
	public String[] soupIngredient = { "�Ұ��", "�κ�", "����", "����ݸ�", "���ֳ���" };

	public ��ȭ����() {
		super.name = "������";
		super.price = 8000;
	}

	public int cooking() {
		super.cookTime = super.cooking();
		boilNoodle();
		super.pourOil();
		putIngredient();
		makeNoodle();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		return super.cookTime;
	}

	public void boilNoodle() {
		System.out.println(this.noodleType + "��(��) ���̰� �ֽ��ϴ�.");
		// ���� ���̴� �ð� +17��
		super.cookTime += 17;
	}

	public void putIngredient() {
		printIngredient();
		System.out.println("��(��) �ֽ��ϴ�.");
		// ��� �ִ� �ð� +10��
		super.cookTime += 10;
	}

	public void printIngredient() {
		if (soupIngredient != null) {
			for (int i = 0; i < soupIngredient.length; i++) {
				System.out.print(soupIngredient[i]);
				if (i != soupIngredient.length - 1)
					System.out.print(", ");
			}
		}
	}

	public void makeNoodle() {
		System.out.println(this.name + "��(��) ����� �ֽ��ϴ�.");
		// ����� �ð� +25��
		super.cookTime += 25;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�� ����: " + this.noodleType);
		System.out.print("�� ���: ");
		printIngredient();
		System.out.println();
		System.out.println("�ֹ� �� ��ޱ��� �ɸ� �� �ð�: " + super.serveTime);
	}
}
