public class ManipulateVariable {
	public static void manipulate(int x, int y) {
		x = x + y;
	}

	public static void main (String[] args) {
		int x = 15;
		int y = 10;
		ManipulateVariable.manipulate(x, y);
		System.out.println(x);
	}
}
