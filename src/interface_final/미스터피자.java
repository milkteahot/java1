public class �̽������� extends ����� {

	public String ingredientType = "������";
	public �̽�������() {
		super.name = "������������";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime = super.cooking();
		chop();
		makeSource();
		return super.cookTime;
	}

	public void chop() {
		System.out.println(this.ingredientType + "��(��) �ڸ��� �ֽ��ϴ�.");
		super.cookTime += 10;
	}

	public void makeSource() {
		System.out.println(this.ingredientType + "��(��) �����ϰ� �ֽ��ϴ�.");
		// ���� ���̴� �ð� +10��
		super.cookTime += 10;
		
	}
	
	

}
