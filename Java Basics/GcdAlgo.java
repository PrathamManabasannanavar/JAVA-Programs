import java.util.Scanner;

class GCD {
	static int gcd1(int a, int b) {
		if(a == 0) return b;
		if(b == 0) return a;
		int t = (a < b) ? a : b;
		while (a % t != 0 || b % t !=  0) {
			t--;
		}
		return t;
	}
	
	//Euclid's algorithm '
	static int gcd2(int a, int b) {
	    if(a < b) {
	    	int temp = a;
	    	a = b;
	    	b = temp;
	    }
	    while(b != 0) {
	    	int rem = a%b;
	    	a = b;
	    	b = rem;
	    }
	    return a;
	}
	
	static int gcd3(int a, int b) {
		if(a == 0) return b;
		if(b == 0) return a;
		while(a != b) {
			if(a > b) 
			     a -= b;
			else
			    b -= a;
		}
		return a;
	}
	
}

public class GcdAlgo {
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter 2 numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.println("GCD by algo1 " + GCD.gcd1(a, b));
		System.out.println("GCD by algo2 " + GCD.gcd2(a, b));
		System.out.println("GCD by algo3 " + GCD.gcd3(a, b));
	}
}
