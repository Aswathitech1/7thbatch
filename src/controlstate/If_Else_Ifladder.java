package controlstate;

import java.util.Scanner;

public class If_Else_Ifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your browser : ");
		browser = sc.next();
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome is openning...");
		}
		else if(browser == "opera") {
			System.out.println("opera is openning...");
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			System.out.println("Safari is openning...");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("Edge is openning...");
		}
		else {
			System.out.println("Invalid browser.");
		}
		
	}

}
