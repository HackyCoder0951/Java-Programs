/**
 * 
 * Thread priority program
 * 
 */

class X extends Thread {
	public void run() {		
		for (int i = 1; i <= 5; i++) {
			System.out.println("\t form thread X : i = "+i);
		}
			System.out.println("Exit from X");
		}
	}

class Y extends Thread {
	public void run() {		
		for (int j = 1; j <= 5; j++) {
			System.out.println("\t form thread Y : i = "+j);
		}
			System.out.println("Exit from Y");
		}
	}

class Z extends Thread {
	public void run() {		
		for (int k = 1; k <= 5; k++) {
			System.out.println("\t form thread Z : i = "+k);
		}
			System.out.println("Exit from Z");
		}
	}

class ThreadTest {
	public static void main(String args[]) {
		new X().start();
		new Y().start();
		new Z().start();
	}
}