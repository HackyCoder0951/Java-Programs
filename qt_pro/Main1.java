/**
	Program of : Creating A Packges
	Import Package
	Static Import
	Cunstructor
	Defing A Class
	Object Cunstruction OR Creat Object
	find sqaure value
*/
//packge userpkg;
import static java.lang.Math.*;
public class Main1 {
	int a = 5,sqr;
	public Main1() {
		sqr = (int)pow(a,2);
	}
	public void display() {
		System.out.println("Square is "+sqr);
	}
	public static void main(String args[]) {
		Main1 m  = new Main1();
		m.display();
	}
}