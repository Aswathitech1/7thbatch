
public class ConstructorS {
	
	
	String name;
	int age;
	float T_mark;
	
	//Default constructor
//	public ConstructorS() {
//		// TODO Auto-generated constructor stub
//		
//		name = "Rifad";
//		age = 23;
//		T_mark = 95.9f;
//		
//		System.out.println("Name : "+name);
//		System.out.println("Age : "+age);
//		System.out.println("Total marks : "+T_mark);
//	}
	
	// Parameterized constructor
	public ConstructorS(String name , int age , float tm) {
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Total marks : "+tm);
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorS c = new ConstructorS();
		ConstructorS c1= new ConstructorS("Heera", 26, 98.9f);
	}

}
