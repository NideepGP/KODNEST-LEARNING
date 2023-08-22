import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)

	{
		if(sides>2) {
			switch(sides) {
			case 3:
				System.out.println("Traingle");
				break;
			
			case 4:
				System.out.println("Quadrilateral");
				break;
			
			case 5:
				System.out.println("Pentagon");
				break;
			
			case 6:
				System.out.println("Hexagon");
				break;
			
			default:
				System.out.println("Polygon");
			}
		}
		
		else {
			System.out.println("Enter valid number of sides of a Polygon.....");
		}
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides of a Polygon:");
		int sides = sc.nextInt();
		identifyPolygon(sides);
	}
}
