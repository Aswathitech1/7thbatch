package methodspkg;

public class ComndLinArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String val = args[0];
		System.out.println(val);
		System.out.println("Hello world......");*/

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1+num2;
		System.out.println("Sum = " +sum);
	}

}
