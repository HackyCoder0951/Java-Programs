class room { // superclass
	int length;
	int breath;
	room(int x, int y) {
		length = x;
		breath = y;
	}
	int area() {
		return (length * breath);
	}
}
class bedroom extends room {
	int height;
	bedroom(int x, int y, int z) {
		super(x, y); // pass value to superclass
		height = z;
	}
	int volume() {
		return (length * breath * height);
	}
}
class singleinheritance {
	public static void main(String args[]) {
		bedroom room1 = new bedroom(14, 12, 10);
		int area1 = room1.area();// superclass method
		int volume1 = room1.volume();
		System.out.println("Area1=" + area1);
		System.out.println("Volume1=" + volume1);
	}
}