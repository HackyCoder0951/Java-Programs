class error {
	public static void main(String Args[]) {
		int a = 10;
		int b = 5;
		int c = 5;
		int x, y;
		try {
			x = a / (b - c); // exception here
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught");
			y = a / (b + c);
			System.out.println("y = " + y);
		}
	}
}