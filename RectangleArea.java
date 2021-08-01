/**

        Program to access another class OR Create object of class

*/
class Rect
{
	int l,b;
	
	Rect(int x,int y)
	{
		l=x;
		b=y;
	}
	
	int rectArea()
	{
		return (l*b);
	}
}

public class RectangleArea
{
	public static void main(String args[])
	{
		Rect rect1 = new Rect(15,10);
		int area = rect1.rectArea();
		
		System.out.print("Area = "+area);
	}
}