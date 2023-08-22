import java.util.Scanner;

public class SimpleIfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks:");
		int marks = sc.nextInt();
		System.out.println("Welcome to Kodenest");
		club(marks);

	}
	
	public static void club(int marks) {
		if(marks >= 80) {
			System.out.println("Welcome to Tech Club");
		}
	}

}
