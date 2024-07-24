package controlstate;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		String search = "fb";
		if(browser == "edge") {
			if(search == "fb") {
				System.out.println("login to fb");
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else {
			System.out.println("Invalid browser");
		}
		System.out.println("Connected......");
	}

}
