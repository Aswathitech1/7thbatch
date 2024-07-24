package exceptionpkg;

import java.util.Scanner;

public class VottingLimit {
	
	public static void limit(int age)throws AgeLimitExp  {
		if(age<18) {
			throw new AgeLimitExp("bellow 18 is not eligible");
		}
		else {
			System.out.println("Welcome to votting process");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int newAge = scan.nextInt();
		limit(newAge);
		System.out.println("Hello......");
	}

}
