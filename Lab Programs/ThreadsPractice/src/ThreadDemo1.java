
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = Thread.currentThread();
		System.out.println("Currrent Thread" + t1);
		t1.setName("hello");
		System.out.println("Modify Current Thread" + t1);
		int n = 5;
		while(n != 0) {
			System.out.println(n);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
			n--;
		}
		System.out.println("done");
	}

}
