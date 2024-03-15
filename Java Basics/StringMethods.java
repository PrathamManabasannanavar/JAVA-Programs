//A simple Java program to demonstrate the Immutable Strings in Java
import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      String str1 = "  hi255662k";
      String str2 = "bye";
      String str3[] = str1.split("i");
      System.out.println(str1.concat(str2));
      System.out.println(str1.trim());
      System.out.println(str1.substring(2, 5));
      System.out.println(str3[1]);
  }
}
