public class Ƽ�ƶ� extends ����� implements ��丮�Ҽ��ִ�{
	
	public String sourceType = "�丶��";
	public Ƽ�ƶ�() {
		super.name = "�Ľ�Ÿ";
		super.price = 8000;
	}
	public int cooking() {
		super.cookTime = super.cooking();
		chop();
		makeSource();
		super.fan();
		return super.cookTime;
	}

	public void chop() {
		System.out.println(this.sourceType + "��(��) �ڸ��� �ֽ��ϴ�.");
		super.cookTime += 10;
	}

	public void makeSource() {
		System.out.println(this.sourceType + "��(��) ���̰� �ֽ��ϴ�.");
		// ���� ���̴� �ð� +10��
		super.cookTime += 10;
		
	}
	@Override
	public void boilNoodle() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void makeNoodle() {
		// TODO Auto-generated method stub
		
	}
	

}
