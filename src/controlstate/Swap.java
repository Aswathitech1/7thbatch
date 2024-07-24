package controlstate;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is"+a);
		System.out.println("b is"+b);

		int x=10,y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
				
	}

}
