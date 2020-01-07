public class 고객 {

	public int[][] address = new int[10][10];

	public String phoneNum;

	public void setBuilding() {
		for (int i = 0; i < address.length; i++) {
			for (int j = 0; j < address[i].length; j++)
				address[i][j] = 0;
		}
	}

	public void delivered(int floor, int unit) {
		address[floor - 1][unit - 1] = 1;
	}

	public void printBuilding() {
		for (int i = address.length - 1; i >= 0; i--) {
			System.out.print((i + 1) + "층\t");
			for (int j = 0; j < address[i].length; j++) {
				if (address[i][j] == 0)
					System.out.print("□");
				else
					System.out.print("■");
			}
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("가장 최근에 입력하신 전화번호가 출력됩니다.");
		System.out.println("전화번호: " + this.phoneNum);
		System.out.println("지금까지 배달된 층, 호가 표시됩니다.");
		printBuilding();
	}

}
