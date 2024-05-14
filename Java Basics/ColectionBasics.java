//A simple Java program to find differentiate Collection and Collections
import java.util.*;

public class CollectionBasics{
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Collection<String> c1 = new ArrayList<String>();
      c1.add("bye");
      Collections.addAll(c1, "hi"); 
      /*
         Collection -> interface
         Collections -> class
      */
      System.out.println(c1);
  }
}
