package oops.pkg;

class Animal{
	String color;
	
	public void eat() {
		System.out.println("Animal eatting....");
	}
	
}

class Dog extends Animal{
	String breed = "pug";
	int age = 1;
	
	public void sound() {
		System.out.println("Barking...");
	}
}

class Puppy extends Dog{
	String name ="blacky";
	
	public void food() {
		System.out.println("drinking milk");
	}
}

public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy d = new Puppy();
		System.out.println("Color : "+(d.color="black"));
		System.out.println("Breed : "+(d.breed)+"\n"+"Age : "+d.age);
		System.out.println("Name : "+d.name);
		d.eat();
		d.sound();
		d.food();
	}

}
