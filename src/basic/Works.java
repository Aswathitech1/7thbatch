package basic;

public class Works {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int A =20;
//		//Increment (++)
//		
//		//Postfix(A++)
//		int result = A++;
//		System.out.println("Result is : "+result+"\nA++ is : "+A);
//		
//		//Prefix(++A)
//		int result1 = ++A;
//		System.out.println("Result is : "+result1+"\n++A is : "+A);
//		
//		//Decrement(--)
//		int Value = A--;
//		System.out.println("Result is : "+Value+"\nA-- is : "+A);
//		int Value1 = --A;
//		System.out.println("Result is : "+Value1+"\n--A is : "+A);
		
		
		
//		
//		int a = 10;
//		int b = 20;
//		
//		boolean exp = a!=b;
//		boolean exp1 = a>b;
//		
//		System.out.println("Expresion 1 a!=b : "+exp);
//		System.out.println("Expresion a>b : "+exp1);
//		
//		boolean result = exp||exp1;
//		System.out.println("a||b : "+result);
//		boolean res = !(exp||exp1);
//		System.out.println("!(a||b)"+res);
//		
//		//!(a&&b) 
//		
//		int x = 30;
//		int y = 40;
//		
//		boolean a1 = x < y;
//		boolean b1 = x > y;
//	    boolean result1 = a1&&b1;
//		System.out.println("a&&b is "+result1);
//		boolean res1 = !(a1&&b1);
//		System.out.println("!(a&&b) is "+res1);
//		//!( (a||b) && (a||b) )
//		boolean res2 = (a1||b1) && (a1||b1);
//		System.out.println("result is :"+res2);
//		boolean res3 = !((a1||b1) && (a1||b1));
//		System.out.println("Result is :"+res3);
		
		
		
		
		//!( (a&&b) || (a&&b) )
		
		int num = 2 ,num1=9, num2 = num1;
		
		boolean a = num1 == num2; //true
		boolean b = num!= num1;//true
		
		System.out.println("Result : "+((a&&b)||(a&&b)));
		System.out.println("Not operator : "+(!( (a&&b) || (a&&b) )));
		
		//Ternary operator
		
		int nums =10;
		String oddEven = (num%2==0)?"Even":"Odd";
		System.out.println(oddEven);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
