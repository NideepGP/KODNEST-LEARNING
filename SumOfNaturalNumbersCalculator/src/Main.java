import java.util.Scanner;

public class Main {
	public static void calculateSum(int n)
	{
		int res = 0;
		for(int i=1;i<=n;i++) {
			res = res + i;
		}
		System.out.println(res);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		calculateSum(n);
	}
}
