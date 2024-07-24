package oops.pkg;
class Birds{
	public void sound() {
		System.out.println("tweet -- tweet");
	}
	
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	public void sound(String sound,String bnam) {
		System.out.println(bnam + " "+sound);
	}
	public void sound(int num) {
		System.out.println(num);
	}
}

public class MethodOverloadingPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b = new Birds();
		b.sound();
		b.sound("quack....quack","Duck");

	}

}
