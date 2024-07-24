package basics;

public class Variabls_Type {
	//Instance variable
	String name = "Arun";
	
	//Static variable
	static String course = "Testing";
	
	public void add() {
		//Local variables
		
		/*int num1,num2,sum;//declaratiuon
		num1=10;//initialization
		num2=20;sum=num1+num2*/
		
		int num1 = 10;
		int num2 = 20;
		int sum = num1+num2;
	
		System.out.println("Sum = "+sum);
	}
	
	public static void main(String[] args) { //start
		// TODO Auto-generated method stub
		
		
		/*  Syntax
		 * Class_Name object_Name or Reference_Variable = new Class_Name();
		 * */
		Variabls_Type obj = new Variabls_Type();//object creation
		obj.add();
		System.out.println("Course = "+course);
		System.out.println("Name = "+(obj.name="Anu"));
		
		
	}

}
