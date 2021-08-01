class Super {
	int x;
	Super(int x) {
		this.x = x;
	}
	void display() // method defined
	{
		System.out.println("super x=" + x);
	}
}
class sub extends Super {
	int y;
	sub(int x, int y) {
		super(x);
		this.y = y;
	}
	void display() // method define again
	{
		System.out.println("super x= " + x);
		System.out.println("sub y=" + y);
	}
}
class methodoveride {
	public static void main(String args[]) {
		sub s1 = new sub(100, 200);
		s1.display();
	}
}