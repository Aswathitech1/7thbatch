package controlstate;

public class Nested_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course = "Testing";
		int option = 1;
		System.out.println("Luminar Technolab");
		switch(course) {
			case "Python":
				System.out.println("Python progrmming language");
				break;
			case "Testing":
				System.out.println("Testing course");
				switch(option) {
					case 1:
						System.out.println("Manual Testing");
						break;
					case 2:
						System.out.println("Automation Testing");
						break;
				}
				break;
			case "Big data":
				System.out.println("Big data course");
				break;
			default:
				System.out.println("Enter valid Input..");
		}
	}
		
}


