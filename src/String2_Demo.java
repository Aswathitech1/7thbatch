
public class String2_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char myarray[] = {'h','e','l','l','o'};
//		System.out.println(myarray);
//		
//		String myarray1[] = {"h","e","l","l","o"};
//		for(int i=0;i<myarray1.length;i++) {
//			System.out.print(myarray1[i]);
//		}
		System.out.println();
		//string literal method
		String name = "Anu";
		String lastname = new String("joseph");
		
		//System.out.println(name+lastname);
		 name.concat(lastname);
		System.out.println(name);
		String newName =name.concat(lastname);
		System.out.println(newName);
		
		//new Keyword
		StringBuffer name1 = new StringBuffer("Poul");
		StringBuilder name2 = new StringBuilder("Babu");
		
		name.concat(lastname);
		System.out.println(name);
		name1.append(name2);
		System.out.println(name1);
		
		name1.append("House");
		System.out.println(name1);
		
		
		
	}

}
