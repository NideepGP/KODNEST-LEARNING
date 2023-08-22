import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		double fahrenheit = sc.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println("Temperature in Celsius = "+temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		sc.close();
	}

}
