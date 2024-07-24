package oops.pkg;

 class Vehicle{


	public final void speed() {
		System.out.println("Speed : 120");
	}
}

class Bike extends Vehicle{
	
	public void speeds() {
		System.out.println("Speed : 100");
	}
}


public class FinalPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.speed();
		final int maxSpeed = 180;
		System.out.println(maxSpeed);
		//maxSpeed = 200;
//		System.out.println(maxSpeed);
		

		
	}

}
