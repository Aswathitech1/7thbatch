package controlstate;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1
22
333
4444
55555
1
22
333
4444
55555*/
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
