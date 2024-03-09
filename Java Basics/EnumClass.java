//Java pgm to demonstrate enum classes
import java.util.*;


enum hello{
  a(20, 59), b(30), c(40);
  int value, t;
  hello(int value, int t) {
    this.value = value;
    this.t = t;
  }
hello(int value) {
    this.value = value;
    this.t = 0;
  }
}
public class EnumClass {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      System.out.println(hello.a.t);
  }
}
