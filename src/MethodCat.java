import java.util.Scanner;

public class MethodCat {

	//1. functn with no return type and no parameter
	//2. function with no return type with parameter
	//instance method
	public void opern(int n1,int n2, int n3, int n4)
	{
		
		int op =n1+n2-n3*n4;
		System.out.println("Result = "+op);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		MethodCat obj = new MethodCat();
		
		int n1=10,n2=30,n3=40,n4=50;
	   
		//funtn call
		obj.opern(100,200, 30, 2);
		obj.opern(n1, n2, n3, n4);
	}

}
