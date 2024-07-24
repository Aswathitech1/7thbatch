
public class MethodCat2 {
	
	//3. funtn with return type and no parameter
	//4. funtn with return type and with parameter
	
	public int add(int n1,int n2) {
		
		int sum = n1+n2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCat2 ob = new MethodCat2();
		
		int Sum = ob.add(10,20);
		int n1 =100,n2 =80;
		System.out.println(Sum);
		System.out.println("Sum = "+ob.add(n1,n2));
		System.out.println("Sum = "+ob.add(20,30));
		

	}

}
