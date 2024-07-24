package controlstate;

public class Continue_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				if(i==4&&j==4) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		
		}
	}

}
