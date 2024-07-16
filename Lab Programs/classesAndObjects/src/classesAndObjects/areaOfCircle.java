package classesAndObjects;
import java.util.Scanner;

class Circle {
	final static float pie = 3.14f;
	public static float area(float radius) {
		return pie * radius * radius;
	}
	public static float perimeter(float radius) {
		return 2 * pie * radius;
	}
}

public class areaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		float radius = sc.nextFloat();
		System.out.println("Area of the circle is : " + Circle.area(radius));
		System.out.println("Perimeter of the circle is : " + Circle.perimeter(radius));
	}

}
