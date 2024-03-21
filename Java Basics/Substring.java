//A simple Java program to search substring/Pattern in a string 
import java.util.Scanner;

class StringMethods {
	public static int isSubstring(String str, String pattern) {
		if(pattern.length() > str.length()) return -1;
		for (int i = 0; i <= str.length() - pattern.length(); i++) {
			int j = 0;
			while (j < pattern.length() && str.charAt(i+j) == pattern.charAt(j)) {
				j++;
			}
			if (j == pattern.length()) return i;
		}
		return -1;
	}
}

public class Substring {
	public static void main(String[] args) {
       String str = "Google is the best search engine";
       String pattern = "ne";
       System.out.println( StringMethods.isSubstring(str, pattern));
	}
}
