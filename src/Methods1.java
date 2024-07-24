import java.util.Scanner;

public class Methods1 {
	
	public  void arithmeticOperations(){
		int a =10,b=20,sum,sub,mul;
		sum = a+b;
		sub = a-b;
		mul = a*b;
		System.out.println(sum+"\n"+sub+"\n"+mul);
	}
	
	public void areaOfCircle() {
		int r = 2;
		float pi =3.144f,area;
		area = pi*r*r;
		System.out.println("Area of Circle is : "+area);
	}
	
	
	public void oddOrEven(int num ) {
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods1 ob = new Methods1();
		for(int i =0;i<5;i++) {
			System.out.println("Hai");
		}
		ob.arithmeticOperations();
		
		ob.areaOfCircle();
		
		System.out.println("Maximum value is : "+Math.max(19, 100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int newnum = sc.nextInt();
		
	   ob.oddOrEven(newnum);
	   
	   ob.oddOrEven(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
