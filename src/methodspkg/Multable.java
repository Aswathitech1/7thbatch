package methodspkg;

public class Multable {
	
	public static void table(int num) {
		for(int i =1;i<=10;i++) {
			
			System.out.println(num+"*"+i +"="+( num*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(2);
	}

}
