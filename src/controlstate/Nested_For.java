package controlstate;

public class Nested_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 12345
		 * 1234
		 * 123
		 * 12
		 * 1*/
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);//1 12 
			}
			System.out.println();
		}

	}

}
