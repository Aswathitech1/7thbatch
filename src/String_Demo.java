
public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Robert                    ";
		String name2 = "Robert";
		String name3 = new String("Robert");
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3));
		System.out.println(name1.charAt(2));
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name1.substring(4));
		System.out.println(name1.trim()+ " is a good boy" );
	}

}
