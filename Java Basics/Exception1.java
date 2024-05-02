//A simple Java program ro demonstrate the Exceptions
/* 
  printStackTrace() -> Prints name, description, Stack trace.
  toString() -> Prints the name + description of the Exception.
  getMessage() -> Prints the Description of the Exception.
*/
import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int a = 4;
      int b = 0;
      try {
        System.out.println(a/b);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("in ArrayIndexOutOfBounds excep");
      }
      catch(ArithmeticException e){
        System.out.println("in Arithmetic excep");
        throw new ArithmeticException("Arithmetic exception occurred");
      }
      catch(Exception e) {
        System.out.println("in catch");
      }
  }
}
