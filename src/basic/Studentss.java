 package basic;

public class Studentss {
	
	//instance variable
	String name;
	int age;
	String email;
	
	//static variables
	static String course = "Testing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 st student
		Studentss stud = new Studentss();
		System.out.println("Course : "+course);
		System.out.println("Student name : "+(stud.name="Anagha"));
		System.out.println("Student age : "+(stud.age=24));
		System.out.println("Student mail_id : "+(stud.email="anagha@gmail.com"));
		
		//2nd student
		Studentss stud1 = new  Studentss();
		System.out.println("Course : "+course);
		System.out.println("Student name : "+(stud1.name="Vindhusha"));
		System.out.println("Student age : "+(stud1.age=27));
		System.out.println("Student mail_id : "+(stud1.email="vindhusha@gmail.com"));
		
		
//		//3rd student
				Studentss stud2 = new  Studentss();
				System.out.println("Course : "+(course = "developer"));
				System.out.println("Student name : "+(stud2.name="Aswathi"));
				System.out.println("Student age : "+(stud2.age=22));
				System.out.println("Student mail_id : "+(stud2.email="aswathi@gmail.com"));
		
		
		

	}

}
