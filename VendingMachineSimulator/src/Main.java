import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode) { 
		
		if(productCode.equals("P01")) {
			System.out.println("Coca Cola");
		}
		
		else if(productCode.equals("P02")) {
			System.out.println("Pepsi");
		}
		
		else if(productCode.equals("P03")) {
			System.out.println("Fanta");
		}
		
		else if(productCode.equals("P04")) {
			System.out.println("JalJeera");
		}
		
		else if(productCode.equals("P05")) {
			System.out.println("MountainDew");
		}
		else if(productCode.equals("P06")){
			System.out.println("BoatGuava");
		}
		else {
			System.out.println("Panaka");
		}
	} 
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product code:");
		String productCode = sc.nextLine();
		getProduct(productCode); 
	}
}
