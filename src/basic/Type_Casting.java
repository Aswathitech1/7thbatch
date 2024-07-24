package basic;

public class Type_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Widening type_casting
		char val = 'A';
		int num = val;
		float res = num;
		System.out.println(val);
		System.out.println(num);
		System.out.println(res);
		
		//Narrowing type_casting
		double dob = 65.5;
		long number = (long)dob;
		char letter = (char)number;
		System.out.println("\n"+dob);
		System.out.println(number);
		System.out.println(letter);
		

	}

}
