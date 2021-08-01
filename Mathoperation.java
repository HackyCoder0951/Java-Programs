class MathTest {
	static float mul(float x, float y) {
		return x * y;
	}

	static float div(float x, float y) {
		return x / y;
	}
}

class Mathoperation {

	public static void main(String args[]) {

		float m = MathTest.mul(4.0f, 5.0f);
		float d = MathTest.div(m, 2.0f);

		System.out.println("m = " + m);
		System.out.println("d = " + d);

	}

}