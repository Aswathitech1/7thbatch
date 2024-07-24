package exceptionpkg;

import java.util.Scanner;

public class ExcpDemo {
	
//	public static void display()
//	{
//		int a= 25,b=0;
//		int div = a/b;
//		System.out.println(div); 
//	}

	public static void check(int age) throws ArithmeticException {
		
		if(age<18) {
			throw new ArithmeticException("Age is not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check(0);
//		try {
//		display();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int num1;
//		try {
//		System.out.println("Enter a number : ");
//		num1= scan.nextInt();
//		System.out.println("Number is "+num1);
//			
//			int arr[] = {1,2,3,4};
//			System.out.println(arr[1]);
//			
//			int a= 25,b=0;
//			int div = a/b;
//			System.out.println(div);
//		}
//		
//		catch(NullPointerException e1) {
//			System.out.println(e1);
//		}
//		catch(ArithmeticException e2) {
//			System.out.println(e2);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			int num = 100;
//			System.out.println(num);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Hai...");
//		
//		int arr[] = {1,2,3,4};
//		try {
//		System.out.println(arr[5]);
//		}
////		catch(ArrayIndexOutOfBoundsException e) {
////			System.out.println("Index 5 out of bounds for length 4");
////		}
		
//		System.out.println("Welcome to java world.....");

	}

}
