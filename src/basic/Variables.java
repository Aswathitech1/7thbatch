package basic;

public class Variables {
	/*Types of variables
	 * 1. Local variable
	 * 2.Instance Variable
	 * 3.Static variable
	 * 4,block variable*/
	
	/*Syntax
	 * 1. variable declaration
	 * data_type variable_name;    eg : int age;
	 * 2. Variable initialization
	 * variable_name = value;		eg: age = 10;
	 * 3.variable declaration with initialization
	 * data_type variable_name =value;		EG: int age = 10;
	 * */
	
	//LOCAL VARIABLE
	
//	void add(){
//		
//		int num1,num2,sum;//declare
//		num1 = 10;//initialize
//		num2 = 20;
//		sum = num1+num2;
//		System.out.println("Sum is : "+ sum);
//	}
	
	//INSTANCE VARIABLE
	
	//STATIC VARIABLE
	static String name ="Litty";
//	int age =28;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object creation
		 * Class_name Refference_Vriable/object_name = new Class_name();
		 * */
		//non_primitive data_type
		//Variables obj = new Variables();
		System.out.println("NAME : "+name);
		
		for(int i =0;i<=10;i++) {
			
		}
		//System.out.println("Age : "+obj.age);
//		obj.add();
	}

}
