public class Person extends Animal {
    private String name;
    public int age;
    
    public Person() {
    	
    }

    public Person(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
    public Person(String name, int age, int money) {
    	this(name, age);
    	this.money = money; //
	}
    ////////////////////////////////////////////////////////getter setter : private 
    public String getter() {
		return name;
	}
    
    public void setter(String name) {
		this.name = name;
	}
    
    
    
    ///////////////////////////////////////////////////////

	public void eat(){
    	System.out.println("Person "+this.name+"is eating");
    }

	public void play(){
    	System.out.println("Person "+this.name+"is playing");

    }

    public void sleep(){
    	System.out.println("Person "+this.name+"is sleeping");
    }

    public void show(){
    	super.show();
    	System.out.println("name: "+this.name);
    	System.out.println("age: "+this.age);
    }

}
