import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int size = sc.nextInt();
		
		int arry[] = new int[size];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<size;i++) {
			arry[i]=sc.nextInt();
		}
		
		System.out.println("Entered values are : ");
		for(int i =0;i<size;i++) {
			System.out.println(arry[i]);
		}

	}
}
