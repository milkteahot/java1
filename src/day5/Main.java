
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Animal(10);
		Animal ani2 = new Animal("mongmong");
		
		Person p1 = new Person("pooh", 5, 100000);
		
		ani1.eat();
		ani2.sleep();
		
		ani1.show();
		p1.show();
		
		p1.play();
		
		p1.setter("1234567");
		p1.getter();
		
		System.out.println("Person"+ p1.getter()); 
	}

}
