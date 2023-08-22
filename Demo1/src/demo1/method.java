package demo1;

public class method {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int res = add(x,y);
		System.out.println(res);
	}
	
	public static int add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}

}
