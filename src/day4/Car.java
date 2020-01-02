//���赵
public class Car {
	//����, ����, ���ᷮ, ����, �����ο�
	//�Ÿ�, �ӵ�;
	//��� ����
	String �̸�="";
	String ����="������";
	String ����="������ī";
	int ���ᷮ=0; //������ ����, ������ �Ǽ� ��� ����
	float ����=8; // ������ �Ÿ�/���ᷮ(km/l) �̹Ƿ�, �Ǽ� ���
	int �����ο�=4; //������ ��
	float �����Ÿ�=0; //������ km, ������ �Ǽ� ��� ����
	int �ӵ�=0; //���� �Ǽ� ��� ����
	float range;
	float fuel;
	//���: �����ϱ�, �����ϱ�, ���߱�
	//��� �޼ҵ�
	void �����ϱ�() {
		this.�ӵ� +=20;
	}
	void �����ϱ�(int ����ӵ�) {
		����ӵ� += 20; //20�� ����
	}
	void �����ϱ�() {
		this.�ӵ� -=20;
	}
	void �����ϱ�(int ����ӵ�) {
		����ӵ�-= 20;
	}
	void ���߱�() {
		this.�ӵ� = 0;
	}
	void ���߱�(int ����ӵ�) {
		����ӵ� = 0;
	}
	void ���º���() {
		
		System.out.println("�ڵ��� ����> �̸�: "+this.�̸�);
		System.out.println("����: "+ this.����);
		System.out.println("����: "+ this.����);
		System.out.println("���� ���ᷮ(l): "+ this.���ᷮ);
		System.out.println("����(km/l): "+ this.����);
		System.out.println("�����ο�: "+ this.�����ο�);
		System.out.println("���� �ӵ�(km): "+ this.�ӵ�);
		System.out.println("������ �� �� �ִ� �Ÿ�(km): "+ this.����*this.���ᷮ);
		
	}
	
	void range() {
		this.range = this.���� *  this.���ᷮ;
		System.out.println();
	}
	void fuelneeded(float �����Ÿ�) {
		this.fuel =  this.�����Ÿ� *  this.���ᷮ;
	}


}
