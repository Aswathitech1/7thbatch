
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,6,7,8,9};
		int sum = 0;
		
		for(int data : num) {
			System.out.println(data);
		}
		
		
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		
		
		System.out.println("sum = "+sum);
		//System.out.println(num[8]);
	}

}
