import java.util.Scanner;

public class Main {

	public static void showMenu1() {
		System.out.println("==============================");
		System.out.println("������ ������ ���� ������ 1���� ������ �ֹ��� �� �ֽ��ϴ�.");
		System.out.println("1. ���������Ҽ���");
		System.out.println("2. �ż�������");
		System.out.println("3. Ƽ�ƶ�");
		System.out.println("4. �̽�������");
		System.out.println("5. ��ȭ����");
		System.out.println("6. ȫ�����");
		System.out.println("7. ��ȭ��");
		System.out.println("0. �ֹ����� ����");
		System.out.println("==============================");
	}

	public static void showMenu2() {
		System.out.println("==============================");
		System.out.println("�ֹ��Ͻ� ���Ŀ� ���� ������ ����Ͻðڽ��ϱ�?");
		System.out.println("1. ��");
		System.out.println("0. �ƴϿ�");
		System.out.println("==============================");
	}

	public static void showMenu3() {
		System.out.println("==============================");
		System.out.println("�ֹ��ڿ� ���� ������ ����Ͻðڽ��ϱ�?");
		System.out.println("1. ��");
		System.out.println("0. �ƴϿ�");
		System.out.println("==============================");		
	}
	
	public static void serveTime(int time) {
		if (time > 100)
			System.out.println("100���� �Ѿ� ����� ���� �ʽ��ϴ�.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu1, menu2,menu3;
		int serveTime;
		int floor, unit;
		���������Ҽ��� k1 = new ���������Ҽ���();
		�ż������� k2 = new �ż�������();
		Ƽ�ƶ� y1 = new Ƽ�ƶ�();
		�̽������� y2 = new �̽�������();
		��ȭ���� c1 = new ��ȭ����();
		ȫ����� c2 = new ȫ�����();
		��ȭ�� c3 = new ��ȭ��();
		������[] ������ = { k1, k2, y1, y2, c1, c2, c3 };
		�� �� = new ��();

		while (true) {
			showMenu1();
			System.out.print("�޴� ��ȣ�� �����ϼ���.");
			menu1 = scan.nextInt();
			if (menu1 == 0)
				break;
			for (int i = 0; i < ������.length; i++) {
				if (menu1 == i + 1) {
					System.out.print("�� �κ� �ֹ��Ͻô��� �Է��ϼ���.");
					������[i].amount = scan.nextInt();
					System.out.print("��ȭ��ȣ�� �Է��ϼ���.");
					��.phoneNum=scan.next();
					System.out.print("������ �Է��ϼ���.");
					floor=scan.nextInt();
					System.out.print("ȣ���� �Է��ϼ���.");
					unit=scan.nextInt();
					������[i].ordered();
					serveTime = ������[i].cooking() + ������[i].delivering();
					������[i].serveTime = serveTime;
					serveTime(serveTime);
					��.delivered(floor, unit);
					showMenu2();
					System.out.print("�޴� ��ȣ�� �����ϼ���.");
					menu2 = scan.nextInt();
					if (menu2 == 1) {
						������[i].showInfo();
					}
					showMenu3();
					System.out.print("�޴� ��ȣ�� �����ϼ���.");
					menu3 = scan.nextInt();
					if (menu3 == 1) {
						��.showInfo();
					}
					
				}
			}
		}

		System.out.println("���� �ֹ��� ����� �����մϴ�.");
		scan.close();
	}

}
