package demo1;

import java.util.Scanner;
public class greet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.next();
		greet(name);
		scan.close();

	}
	
	public static void greet(String nm) {
		System.out.println("Hello "+nm+"... How are you???");
	}

}
