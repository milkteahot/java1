public class Food {
    public String name;
    public int amount;
    public int price;
    public String country;
    public int time=100;
    
    public Food() {
    	System.out.println("Food is ordered.");
    	System.out.println("If you can't deliver in 100min, Order will be cancelled.");
    	System.out.println("#####################");
    }
	public Food(String name, int amount) {
		this();
		this.name = name; //변수에 저장해야 함! 
		this.amount = amount;
		System.out.println(this.name);
	}

	public int getReady(int amount){
		this.time = this.amount *10;
		System.out.println(this.name+" is ordered "+this.amount);
    	System.out.println("food"+this.name + " is getting ready in"+this.time);
    	return time;
    }

    public int cook(){
    	System.out.println("food"+this.name + " is cooking.");
    	return time;
    }

    public int deliver(){
    	System.out.println("food"+this.name + " is delivering.");
    	return time;
    }

    public void show(){
    	System.out.println("#####################");
    	System.out.println("name: "+this.name);
    	System.out.println("price: "+this.price);
    	System.out.println("country: "+this.country);
    	System.out.println("#####################");
    }

}
