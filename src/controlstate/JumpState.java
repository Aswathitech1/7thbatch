package controlstate;

public class JumpState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print till 2 2
		//outer loop
	outer:	for(int i=1;i<5;i++) {
			//inner loop
			for(int j=1;j<5;j++) {
				System.out.println(i+" "+j);//1 1 , 1 2 , 1 3 , 1 4 , 2 1 , 2 2
				if(i==1&&j==2) {
					break outer;
				}
			}
			
			//System.out.println(i);//0 1 2 3 4 
		}

	}

}
