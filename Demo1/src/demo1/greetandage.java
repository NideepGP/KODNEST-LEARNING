package demo1;

import java.util.Scanner;

public class greetandage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.next();
		System.out.println("Enter your birth year:");
		int a = scan.nextInt();
		greet(name);
		int b = age(a);
		System.out.println("Your "+b+" years old.");
		scan.close();

	}
	
	public static void greet(String nm) {
		System.out.println("Hello "+nm+"...");
	}
	
	public static int age(int a) {
		return 2023-a;		
	}
	

}
