public class Animal {
    public String name;
    private int age;
    
    public Animal() {
		System.out.println("animal is created.");
	}
    
	public Animal(String name, int age) {
		this();
		this.age = age;
		this.name = name;
	}
	
	public Animal(String name) {
		this();
		this.name = name;
	}

	public Animal(int age) {
		this();
		this.age = age;
	}

	public void eat(){
    	System.out.println("animal"+this.name + "is eating something");
    }

    public void play(){
    	System.out.println("animal"+this.name + "is playing.");
    }

    public void sleep(){
    	System.out.println("animal"+this.name + "is sleeping.");
    }

    public void show(){
    	System.out.println("#####################");
    	System.out.println("name: "+this.name);
    	System.out.println("age: "+this.age);
    	System.out.println("#####################");
    }

}
