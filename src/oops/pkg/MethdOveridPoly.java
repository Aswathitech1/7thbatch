package oops.pkg;

class Animalss{
	
	public void eats() {
		System.out.println("Animal eatting");
	}
}

class Catsss extends Animalss{
	public void eat() {
		System.out.println("Cat is eatting his food");
	}
}
public class MethdOveridPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catsss c = new Catsss();
		c.eat();
		c.eats();
	}

}
