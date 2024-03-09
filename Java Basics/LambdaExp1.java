//Java program to demonstrate the Lambda expression
import java.util.*;

interface A {
  public void hello(int value);
}

public class LambdaExp1 {
    public static void main(String[] args) {
      A ref = (int value) -> {
          System.out.print("in Anonymous class");
       };
      ref.hello(5);
  }
}
