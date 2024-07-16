package classesAndObjects;
import java.util.Scanner;

class Area {

	public static float areaRect(float length, float breadth) {
		return length * breadth;
	}
	public static float areaSquare(float length) {
		return length * length;
	}
}

public class areaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float length, breadth;
		System.out.println("Enter r or s: ");
		char choice = sc.next().charAt(0);
		switch(choice)
		{
		case 'r':
			System.out.println("ENter the length and breadth of rectangle:");
			length = sc.nextFloat();
			breadth = sc.nextFloat();
			System.out.println("area = " + Area.areaRect(length, breadth));
			break;
		case 's':
			System.out.println("Enter the length of square:");
			length = sc.nextFloat();
			System.out.println("area = " + Area.areaSquare(length));
			break;
		}
		
	}

}
