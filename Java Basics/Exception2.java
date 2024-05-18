//A simple Java program to demonstrate the User defined Exceptions
import java.util.*;

class MyException  extends Exception{
  MyException() {
    super("hi in MyException");
  }
  MyException(String str) {
    
  }
}
public class Exception2 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int a = 4;
      int b = 0;
      try {
        a /= b;
      }
      catch(ArithmeticException e) {
       MyException my = new MyException();
       System.out.println(my.getMessage());
       System.out.println("in block");
      }
      System.out.println("After block");
      
  }
}
