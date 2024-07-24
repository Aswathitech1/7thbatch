import java.util.Scanner;

public class MultiScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.println("Enter row size : ");
		row = sc .nextInt();
		System.out.println("Enter column size : ");
		col = sc .nextInt();
		
		int arr[][] = new int[row][col];
		System.out.println("Enter the array elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");;
			}
			System.out.println();
		}
	}

}
