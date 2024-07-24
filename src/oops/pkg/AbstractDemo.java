package oops.pkg;

abstract class Vehicles{
	int tyres;
	public abstract void start(); 
	
	public void speed() {
		System.out.println("Max speed is 140");
	}
}

class Cars extends Vehicles{
	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Key start");
	}
	
}

class Bikess extends Vehicles{
	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Kick start");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vehicles v = new Vehicles();
		Cars c = new Cars();
		c.tyres = 4;
		c.start();
		//c.starts();
		Bikess b = new Bikess();
		b.start();
	}

}
