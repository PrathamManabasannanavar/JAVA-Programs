//A simple Java program to demonstrate Inner class
class A {
	
	public void printInA(){
		System.out.println("in A");
	}
	
	class InnerA{
		public void printInnerA(){
				System.out.println("in Inner A");		
		}
		
	}
	
}

public class InnerClassDemo1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.printInA();
		
		//Accessing inner A class
	   A.InnerA ia = a1.new InnerA();
	   ia.printInnerA();
	   //if class InnerA was static then
	   //A.InnerA ia = A.InnerA.printInnerA();
	}
