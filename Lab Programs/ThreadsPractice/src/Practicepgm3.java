
public class Practicepgm3 extends Thread{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Addition(6, 2);
	    new Sub(6, 2);
	    new Mult(6, 2);
		new Div(6, 2);
	}

}
class Addition extends Thread{
    int a, b;
    Addition(int a, int b){
		this.a = a;
		this.b = b;
		start();
	}
	public void run() {
		System.out.println("a + b = "+ (a+b));
	}
}
class Sub extends Thread{
    int a, b;
    Sub(int a, int b){
		this.a = a;
		this.b = b;
		start();
	}
	public void run() {
		System.out.println("a - b = "+ (a-b));
	}
}

class Mult extends Thread{
    int a, b;
    Mult(int a, int b){
		this.a = a;
		this.b = b;
		start();
	}
	public void run() {
		System.out.println("a * b = "+ (a*b));
	}
}

class Div extends Thread{
    int a, b;
    Div(int a, int b){
		this.a = a;
		this.b = b;
		start();
	}
	public void run() {
		if(b != 0) {
			System.out.println("a / b = "+ (a/b));
			return;
		}
		try {
			throw new ArithmeticException();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}

