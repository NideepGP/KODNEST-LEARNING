package objectCreation;

public class FanApp {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.noOfWings = 3;
		f1.color = "white";
		f1.cost = 3500;
		f1.brand = "Bajaj";
		
		System.out.println(f1.noOfWings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		
		f1.rotate();
		f1.blowAir();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Fan f2 = new Fan();
		f2.noOfWings = 4;
		f2.color = "black";
		f2.cost = 4500;
		f2.brand = "Havels";
		
		System.out.println(f2.noOfWings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		
		f2.rotate();
		f2.blowAir();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Fan f3 = new Fan();
		f3.noOfWings = 3;
		f3.color = "brown";
		f3.cost = 2500;
		f3.brand = "Cromptons";
		
		System.out.println(f3.noOfWings+" "+f3.color+" "+f3.cost+" "+f3.brand);
		
		f3.rotate();
		f3.blowAir();

	}

}
