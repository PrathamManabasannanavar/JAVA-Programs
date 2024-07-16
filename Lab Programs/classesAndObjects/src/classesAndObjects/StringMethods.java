//  A simple java program to demonstrate the string methods
package classesAndObjects;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[] = {"google", "yahoo"};
		for(String ch: s1) {
			System.out.println(ch);
			}
		String s2 = "hello ";
		String s3 = "moto		";
		s2 = s2.trim();
		System.out.println(s2.concat(s3));
		s3 = s3.toUpperCase();
		s3 = s3.trim();
		String s4[] = s3.split("O");
		System.out.println(s4[1]);
		System.out.println(s3.indexOf('O'));
	}
}
