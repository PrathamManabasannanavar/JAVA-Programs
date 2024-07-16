
class PrintNos extends Thread{
	static Object lock = new Object();
	public PrintNos(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	synchronized public void run() {
		synchronized(lock) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {}
		}
		}
	}
}
public class Practicepgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new PrintNos("t1");
		Thread t2 = new PrintNos("t2");
		Thread t3 = new PrintNos("t1");
		
		t1.start();
		t2.start();
		t3.start();
		try {
		t1.join();
		t2.join();
		t3.join();
		}
		catch(Exception ie) {}
		System.out.println("main exiting");
	}

}
