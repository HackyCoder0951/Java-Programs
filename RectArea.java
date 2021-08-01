class rectangle 
{
	int length, width; // decleration;

	void getdata(int x, int y) // method;
	{
		length = x;
		width = y;
	}

	int rectarea() 
	{
		int area = length * width;
		return (area);
	}
}

class RectArea 
{

	public static void main(String[] args) 
	{

		int area1;
		int area2;
		rectangle rect1 = new rectangle();
		rectangle rect2 = new rectangle();
		rect1.length = 15;
		rect1.width = 10;

		area1 = rect1.length * rect1.width;

		rect2.getdata(20, 12);
		area2 = rect2.rectarea();

		System.out.println("Area1=" + area1);
		System.out.println("Area2=" + area2);

	}

}

/*
 * area 1=150 area 2=240
 */