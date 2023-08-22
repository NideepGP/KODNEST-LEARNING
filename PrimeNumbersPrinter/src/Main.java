import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)
	{
		int count = 0;
		boolean prime = true;
		for(int i=2;;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime = false;
					break;
				}
				prime = true;
			}
			if(prime==true) {
				System.out.println(i);
				count++;
			}
			if(count==n) {
				return;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrimes(n);
	}
}
