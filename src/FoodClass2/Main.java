import java.util.Scanner;
 
public class Main {
 
    public static void showMenu1() {
        System.out.println("==============================");
        System.out.println("음식의 종류에 따라 음식을 1가지 선택해 주문할 수 있습니다.");
        System.out.println("1. 밥류(오늘의 메뉴: 비빔밥)");
        System.out.println("2. 면류(오늘의 메뉴: 짜장면)");
        System.out.println("3. 탕류(오늘의 메뉴: 감자탕)");
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
 
    public static void serveTime(int time) {
        if (time > 100)
            System.out.println("100분이 넘어 요금을 받지 않습니다.");
    }
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        int menu1, menu2;
        int serveTime;
        int amount;
        while (true) {
            showMenu1();
            System.out.print("메뉴 번호를 선택하세요.");
            menu1 = scan.nextInt();
            if (menu1 == 0)
                break;
            if (menu1 == 1) {
                System.out.print("몇 인분 주문하시는지 입력하세요.");
                amount = scan.nextInt();
                Rice rice = new Rice("비빔밥", amount);
                rice.ordered();
                serveTime = rice.cooking() + rice.delivering();
                rice.serveTime = serveTime;
                serveTime(serveTime);
                showMenu2();
                System.out.print("메뉴 번호를 선택하세요.");
                menu2 = scan.nextInt();
                if (menu2 == 1)
                    rice.showInfo();
            }
            if (menu1 == 2) {
                System.out.print("몇 인분 주문하시는지 입력하세요.");
                amount = scan.nextInt();
                Noodle noodle = new Noodle("짜장면", amount);
                noodle.ordered();
                serveTime = noodle.cooking() + noodle.delivering();
                noodle.serveTime = serveTime;
                serveTime(serveTime);
                showMenu2();
                System.out.print("메뉴 번호를 선택하세요.");
                menu2 = scan.nextInt();
                if (menu2 == 1)
                    noodle.showInfo();
            }
            if (menu1 == 3) {
                System.out.print("몇 인분 주문하시는지 입력하세요.");
                amount = scan.nextInt();
                Soup soup = new Soup("감자탕", amount);
                soup.ordered();
                serveTime = soup.cooking() + soup.delivering();
                soup.serveTime = serveTime;
                serveTime(serveTime);
                showMenu2();
                System.out.print("메뉴 번호를 선택하세요.");
                menu2 = scan.nextInt();
                if (menu2 == 1)
                    soup.showInfo();
            }
        }
 
        System.out.println("음식 주문과 배달을 종료합니다.");
        scan.close();
    }
 
}
 
