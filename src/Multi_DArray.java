
public class Multi_DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num[][] = new int[2][3];
//		
//		num[0][0] = 10;
//		num[0][1] =100;
//		num[0][2] = 50;
//		
//		num[1][0] = 30;
//		num[1][1] = 20;
//		num[1][2] = 90;
		
		int num[][] = {{10,100,50},{30,20,40}};
		
		for(int row=0;row<2;row++) {
			for(int col = 0;col<3;col++){
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
