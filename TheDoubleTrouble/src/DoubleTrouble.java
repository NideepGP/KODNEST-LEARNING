import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int num = sc.nextInt();
		System.out.println("Double of no. is "+doubleTheNumber(num));

	}
	
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
