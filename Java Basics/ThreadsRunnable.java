//A simple Java program to Demonstrate class implements Runnable interface
import java.util.*;

public class Main {
    public static void main(String[] args) {
      MyClass r1 = new MyClass();
      Thread t1 = new Thread(r1);
      t1.start();
  }
}
//class MyClass extends Thread implements Runnable --> This works
class MyClass implements Runnable{
   public void run(){
     System.out.println("in run of Myclass");
   }
}
