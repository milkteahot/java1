public class �߽��� extends ������ {

	public String country = "�߱�";

	public void pourOil() {
		System.out.println(super.name + "�� �⸧�� �׽��ϴ�.");
		// �⸧ �״� �ð� +5��
		super.cookTime += 5;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�����Ͻ� ���� ����: �߽�");
	}
	
}
