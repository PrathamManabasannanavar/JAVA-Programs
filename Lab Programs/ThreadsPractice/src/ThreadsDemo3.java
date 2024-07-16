class ThreadsUsingConstructor extends Thread {
	ThreadsUsingConstructor(){
		super("Demon Thread");
		System.out.println("child thread" + this);
		this.start();
	}
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i);
			try{ this.sleep(1000);}
			catch(Exception e) {}
		}
	}
}
public class ThreadsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadsUsingConstructor();
		for(int i=0; i<100; i++) {
			System.out.println(i);
			try{ Thread.currentThread().sleep(1000);}
			catch(Exception e) {}
		}
	}

}
