import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score = sc.nextInt();
		Grade g1 = new Grade();
		g1.givingGrade(score);
	}

}
