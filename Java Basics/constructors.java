//A simple Java program to demonstrate the Constructors
class Shape {
	public int length, breadth;
	public Shape() {
		length = breadth = 0;
	}
	public Shape(int length) {
		this.length = length;
	}
	public Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

}

class test {
	public static void main(String[] args) {
		Shape s1 = new Shape(); //general constructor

    //Parameterized constructor
		Shape s2 = new Shape(4);
		Shape s3 = new Shape(4, 6);
		System.out.println("    l\tb");
		System.out.println("s1: " + s1.length + "\t" + s1.breadth);
		System.out.println("s2: " + s2.length);
		System.out.println("s3: " + s3.length + "\t" + s3.breadth);
	}

}
