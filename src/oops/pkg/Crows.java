package oops.pkg;

public class Crows implements Birds123{
	String color = "black";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Crows c = new Crows();//upcasting
			//System.out.println(c.color);
			c.sound();
			
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Kaa....Kaaa...");
	}

}
