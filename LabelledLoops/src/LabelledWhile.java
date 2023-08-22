
public class LabelledWhile {

	public static void main(String[] args) {
		System.out.println("Start");
		int i = 1;
		sattu:while(i<5) {
			int m = 1;
			katha:while(m<5) {
				System.out.println("Heee ");
				m++;
				break sattu;
			}
			i++;
			System.out.println(" ");
		}
		System.out.println("Ended.........");
	}

}
