public class Rice extends Food {
    public int time=100; //준비-요리-배달까지 걸리는 시간 
    private int discount=1000; //할인 가격 
	
    public Rice() {
    	
    }

    public Rice(String name, int amount) { //요리이름과 주문수량 
    	this();
		this.name = name;
		this.amount = amount;
	}
    public Rice(String name, String country) { //요리이름과 나라 
    	this();
	}
    
    ////////////////////////////////////////////////////////getter setter : private 
    public int getter() {
		return discount;
	}
    
    public void setter(int discount) {
		this.discount = discount;
	}
    
    ///////////////////////////////////////////////////////

	public int getReady(){
		time = amount*10;
    	System.out.println("Rice] "+this.name+" is getting ready in "+time+" min");
    	return time;
    }

	public int cook(){
    	System.out.println("Rice] "+this.name+" is cooking for 20 min");
    	this.time +=20;
    	return time;

    }

//    public int deliver(){
//    	this.time += 30;
//    	System.out.println("Rice] "+this.name+" is delivering in "+this.time+" min");
//    	return time;
//    }

    public void show(){
    	System.out.println("name: "+this.name);
    	System.out.println("amount: "+this.amount);
    	System.out.println("remain time: "+this.time);
    	System.out.println("#####################");
    	
    	
    }
    public void showtime() {
    	time = 100-this.time;
    	System.out.println("total remain time: "+time);
    	if(this.time < 20) {
    		System.out.println("sorry for late..we offer you "+this.discount+ " discount coupon");
    	}
    	if(this.time <0) {
    		System.out.println("customer cancelled order...");
    	}
    }

}
