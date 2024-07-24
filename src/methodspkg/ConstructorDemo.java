package methodspkg;

public class ConstructorDemo {
	
	//Instance variable
	int sum;
	
	public ConstructorDemo(int num1 , int num2 ) {
		// TODO Auto-generated constructor stub
		
		sum=num1+num2;	
	}
	public void display() {
		
		System.out.println("sum = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj = new ConstructorDemo(90,20);
		obj.display();
		ConstructorDemo obj1=obj;
		obj1.display();
	}

}
