package Player;

public class HalfHuman extends Player {
	private String figure;
	
	public HalfHuman(String name) {
		super(name);
		this.hp = 120;
	}
	
	public String getFigure() {
		return figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("분류: 반인간");
	}
}
