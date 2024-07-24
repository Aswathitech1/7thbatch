package basic;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		long phone;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name =scanner.next();
		System.out.println("Enter your age : ");
		age =scanner.nextInt();
		System.out.println("Enter your phone number : ");
		phone =scanner.nextLong();
		System.out.println("\nName = "+name);
		System.out.println("Age = "+age);
		System.out.println("Phone Number = "+phone);

	}

}
