package methodspkg;

import java.util.Scanner;

public class NoRetNopara {
	
	public  float areaOfSquare(float a) {
		float area;
		area =a*a;
		
		//System.out.println("Area of Square = "+area);
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//areaOfSquare();
		NoRetNopara obj = new NoRetNopara();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value = ");
		float num = sc.nextFloat();
		
		System.out.println(obj.areaOfSquare(num));
		//obj.areaOfSquare();
		//System.out.println("Value = "+obj.areaOfSquare(2.5f));
		
		
	}

}
