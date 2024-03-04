import java.util.Scanner;

class Area {
	private int length, breadth;

	public String shapeName() {
		if (length == breadth)
			return "square";
		return "rectangle";
	}

	public int computeArea() {
		return length * breadth;
	}

	public void setValue(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

public class Shape2D {
	public static void main(String[]args) {

		Area a1 = new Area();
		System.out.println("Enter length and breadth ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		a1.setValue(l, b);
		System.out.println("Area of " + a1.shapeName() + " is :" +
						   a1.computeArea());
	}
}
