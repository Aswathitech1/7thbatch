package oops.pkg;

public class ThisDemo {
	//student details
	
	String name;
	String emailId;
	long phoneNo;
	
	public ThisDemo(String name , String emailId , long phoneNo) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.emailId = emailId;
		this.phoneNo = phoneNo;	
	}
	
	public void display() {
		System.out.println(name+"\n"+emailId+"\n"+phoneNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td = new ThisDemo("Litty", "Litty@gmail.com", 1234567890l);
		ThisDemo td1 = new ThisDemo("Anagha", "anagha@gmail.com", 1223309898l);
		td.display();
		td1.display();
	}

}
