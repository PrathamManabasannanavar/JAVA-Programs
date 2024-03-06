//A Java program to demonstrate the Anonymous Classes 
class A {
	
	public void printA(){
		System.out.println("in A");
	}
	
}

public class AnonymousClasses{
	public static void main(String[] args) {
		A b1 = new A() {
			//Function overiding
			public void printA() {
				System.out.println("in B");
			}
			
		};
		b1.printA();		
		
	}
}
