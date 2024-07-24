package methodspkg;

import java.util.Scanner;

public class MethodsDemoo {
	
	public void findPosNeg(int num) {
		if(num>0) {
			System.out.println("The number "+num+" is positive");
		}
		else {
			System.out.println("The number "+num+" is negative");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Maximum Value : "+Math.max(10, 100));
//		System.out.println("Squereroot : "+Math.sqrt(2));
		MethodsDemoo meth = new MethodsDemoo();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer number : ");
		int num =scan.nextInt();
		System.out.println("The num is "+num);
		meth.findPosNeg(num);
		
	}

}
