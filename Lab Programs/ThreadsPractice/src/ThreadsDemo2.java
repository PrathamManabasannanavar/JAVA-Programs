
class myThread extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				}
				catch(Exception e) {}
		
		}
	}
}
public class ThreadsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new myThread();
		t1.setPriority(t1.MAX_PRIORITY);
		t1.start();
	}

}
