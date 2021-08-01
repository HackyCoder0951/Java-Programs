interface Area {
	final static float pi = 3.14f;

	float compute(float x, float y);
}
class rectagl implements Area {
	public float compute(float x, float y) {
		return (x * y);
	}
}
class circle implements Area {
	public float compute(float x, float y) {
		return (pi * x * x);
	}
}
class interfacetest {
	public static void main(String args[]) {
		rectagl rect = new rectagl();
		circle cir = new circle();
		Area area;
		area = rect;
		System.out.println("Area of rectangle = " + area.compute(10, 20));
		area = cir;
		System.out.println("Area of circle = " + area.compute(10, 0));
	}
}