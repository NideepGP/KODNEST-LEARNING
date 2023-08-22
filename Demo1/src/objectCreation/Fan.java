package objectCreation;

public class Fan {
	int noOfWings;
	String color;
	int cost;
	String brand;
	
	void rotate()
	{
		System.out.println("Fan of "+color+" color, "+brand+" brand, "+noOfWings+" wings and costs "+cost+" is rotating.");
	}
	
	void blowAir() {
		System.out.println("Fan of "+color+" color is blowing the air.");
	}
}
