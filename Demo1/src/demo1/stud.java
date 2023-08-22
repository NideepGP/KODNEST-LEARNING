package demo1;

import java.util.Scanner;

public class stud {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student first name");
		String a = scan.next();
		System.out.println("Value in a is "+a);
		
		System.out.println("Enter student last name");
		String b = scan.next();
		System.out.println("Value in b is "+b);
		
		System.out.println("Enter student age");
		int c = scan.nextInt();
		System.out.println("Value in c is "+c);
		
		System.out.println("Enter student gender");
		String d = scan.next();
		System.out.println("Value in d is "+d);
		
		System.out.println("Is student married? Say True or False");
		boolean e = scan.nextBoolean();
		System.out.println("Value in e is "+e);
		
		System.out.println("Enter student branch");
		String f = scan.next();
		System.out.println("Value in f is "+f);
		
		System.out.println("Enter student height");
		float g = scan.nextFloat();
		System.out.println("Value in g is "+g);
		
		System.out.println("Enter student weight");
		double h = scan.nextDouble();
		System.out.println("Value in h is "+h);
	}

}
