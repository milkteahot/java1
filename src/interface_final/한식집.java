public class �ѽ��� extends ������ {
	public String ���� = "�ѱ�";
	
    public int cookRice(){
    	System.out.println("���� �ϰ� �ֽ��ϴ�.");
		// ���ϴ� �ð� 20������ ����
		super.cookTime += 20;
		return super.cookTime;
    }

    public void boilSoup(){
    	System.out.println("������ ���̰� �ֽ��ϴ�.");
		// �������̴� �ð� 20������ ����
		super.cookTime += 20;
    }
    
    public void showInfo() {
		super.showInfo();
		
	}
    
    
    

}
