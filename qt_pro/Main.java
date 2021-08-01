/**
	Program of :	super keyword and super cunsturctor
					creating interface
					accessing interface or implementing interface 
					static fields
					using final variable
					java constants
					single level inheritance
					multi-level inheritance
					multi threading
					thread priority
					exception handling
*/
interface iface{
	final int min = 1;
	final int avg = 5;
	final int max = 10;
}
class A extends Thread implements iface{
	int min = iface.min;
	int avg = iface.avg;
	int max = iface.max;
	public A(){}
	public A(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" is Running ...");
	}
}
class B extends A{
	public B(){}
	public B(String name){
		super(name);
	}
}
public class Main{
	public static void main(String args[]){
		B t1 = new B("Thread-1");
		B t2 = new B("Thread-2:");
		B t3 = new B("Thread-3:");
		try{
			t1.setPriority(t1.min);
			t2.setPriority(t2.avg);
			t3.setPriority(t3.max);
			
			t1.start();
			t2.start();
			t3.start();
		}
		catch(Exception e){
			System.out.println("Exception occur while starting Thread");
		}
		System.out.println("Program is started");
	}
}