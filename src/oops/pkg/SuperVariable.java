package oops.pkg;
class Students{
	//String name = "Nandha";
//	public void duty() {
//		System.out.println("Studying");
//	}
	public Students( ) {
		// TODO Auto-generated constructor stub
		System.out.println("Students....");
	}
	public  Students(int num) {
		System.out.println(num);
	}
}
class Teacher extends Students{
	//String name = "Sumitha";
//	public void duty() {
//		super.duty();
//		System.out.println("Teaching");
//		
//	}
	public Teacher() {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("teachers");
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		//t.duty();
	}

}
