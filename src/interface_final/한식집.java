public class 한식집 extends 음식점 {
	public String 나라 = "한국";
	
    public int cookRice(){
    	System.out.println("밥을 하고 있습니다.");
		// 밥하는 시간 20분으로 설정
		super.cookTime += 20;
		return super.cookTime;
    }

    public void boilSoup(){
    	System.out.println("국물을 끓이고 있습니다.");
		// 국물끓이는 시간 20분으로 설정
		super.cookTime += 20;
    }
    
    public void showInfo() {
		super.showInfo();
		
	}
    
    
    

}
