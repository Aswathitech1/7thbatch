package oops.pkg;
class Birdss{
	public void haslegs() {
		System.out.println("has 2 legs...");
	}
	
	public void sings()
	{
		System.out.println("tweet --- tweet");
	}
	
	public void haslegs(int legs) {
		System.out.println("Bird has "+legs);
	}
}

class Duck extends Birdss{
	public void sings() {
		System.out.println("Quack-----Quack");
	}
}
public class PolyDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		d.haslegs(2);
		d.sings();
	}

}
