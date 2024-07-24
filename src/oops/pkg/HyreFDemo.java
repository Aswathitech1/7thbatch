package oops.pkg;

class Animals{
	String color;
	
	public void eat() {
		System.out.println("Animal eatting...");
	}
}

class Cat extends Animals{
	String name = "Kitty";
	
	public void sound() {
		System.out.println("Meow...meeow...");
	}
}

class Lion extends Animals{
	int weight = 150;
}

public class HyreFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		System.out.println("Color : "+(c.color="white"));
		System.out.println("Name : "+c.name);
		c.eat();c.sound();
		
		Lion l = new Lion();
		System.out.println("Color : "+(l.color="brown"));
		System.out.println("weight : "+l.weight);
		l.eat();
	}

}
