import java.util.Scanner;

public class Main {

	public static void showMenu1() {
		System.out.println("==============================");
		System.out.println("음식의 종류에 따라 음식을 1가지 선택해 주문할 수 있습니다.");
		System.out.println("1. 신의주찹쌀순대");
		System.out.println("2. 신선설농탕");
		System.out.println("3. 티아라");
		System.out.println("4. 미스터피자");
		System.out.println("5. 리화쿵부");
		System.out.println("6. 홍콩반점");
		System.out.println("7. 이화성");
		System.out.println("0. 주문하지 않음");
		System.out.println("==============================");
	}

	public static void showMenu2() {
		System.out.println("==============================");
		System.out.println("주문하신 음식에 관한 정보를 출력하시겠습니까?");
		System.out.println("1. 예");
		System.out.println("0. 아니오");
		System.out.println("==============================");
	}

	public static void showMenu3() {
		System.out.println("==============================");
		System.out.println("주문자에 관한 정보를 출력하시겠습니까?");
		System.out.println("1. 예");
		System.out.println("0. 아니오");
		System.out.println("==============================");		
	}
	
	public static void serveTime(int time) {
		if (time > 100)
			System.out.println("100분이 넘어 요금을 받지 않습니다.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu1, menu2,menu3;
		int serveTime;
		int floor, unit;
		신의주찹쌀순대 k1 = new 신의주찹쌀순대();
		신선설농탕 k2 = new 신선설농탕();
		티아라 y1 = new 티아라();
		미스터피자 y2 = new 미스터피자();
		리화쿵부 c1 = new 리화쿵부();
		홍콩반점 c2 = new 홍콩반점();
		이화성 c3 = new 이화성();
		음식점[] 음식점 = { k1, k2, y1, y2, c1, c2, c3 };
		고객 고객 = new 고객();

		while (true) {
			showMenu1();
			System.out.print("메뉴 번호를 선택하세요.");
			menu1 = scan.nextInt();
			if (menu1 == 0)
				break;
			for (int i = 0; i < 음식점.length; i++) {
				if (menu1 == i + 1) {
					System.out.print("몇 인분 주문하시는지 입력하세요.");
					음식점[i].amount = scan.nextInt();
					System.out.print("전화번호를 입력하세요.");
					고객.phoneNum=scan.next();
					System.out.print("층수를 입력하세요.");
					floor=scan.nextInt();
					System.out.print("호수를 입력하세요.");
					unit=scan.nextInt();
					음식점[i].ordered();
					serveTime = 음식점[i].cooking() + 음식점[i].delivering();
					음식점[i].serveTime = serveTime;
					serveTime(serveTime);
					고객.delivered(floor, unit);
					showMenu2();
					System.out.print("메뉴 번호를 선택하세요.");
					menu2 = scan.nextInt();
					if (menu2 == 1) {
						음식점[i].showInfo();
					}
					showMenu3();
					System.out.print("메뉴 번호를 선택하세요.");
					menu3 = scan.nextInt();
					if (menu3 == 1) {
						고객.showInfo();
					}
					
				}
			}
		}

		System.out.println("음식 주문과 배달을 종료합니다.");
		scan.close();
	}

}
