import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed and time to calculate distance:");
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed, time));

	}

}
