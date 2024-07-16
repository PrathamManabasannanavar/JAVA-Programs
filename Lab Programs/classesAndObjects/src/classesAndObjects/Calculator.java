package classesAndObjects;
import java.util.Scanner;
class Calci{
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int prod(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		if(b != 0)
			return a/b;
		return 0;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a+b = " + Calci.add(a, b));
		System.out.println("a-b = " + Calci.sub(a, b));
		System.out.println("a*b = " + Calci.prod(a, b));
		System.out.println("a/b = " + Calci.div(a, b));
	}

}
