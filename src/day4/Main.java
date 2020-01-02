import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car(); //��üCar�� ����Ű�� myCar�� �ν��Ͻ�����
		Scanner input = new Scanner(System.in);
		myCar.���º���();
		
		//�̸� �Է¹ޱ�
		System.out.println("�̸��� �Է��ϼ���: ");
		myCar.�̸� = input.nextLine();
		myCar.���º���();
		
		//���ᷮ �Է¹ޱ�
		System.out.println("���Ḧ �����ϼ���: ");
		myCar.���ᷮ = input.nextInt();
		myCar.���º���();
		myCar.range();
	}
	
}
