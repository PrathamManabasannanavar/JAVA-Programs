//A simple java program to finf the square roots of a Quadratic equation 
import java.util.*;

public class QuadraticEquation{
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Equation e1 = new Equation();
      e1.quadraticEq(1, 2, 3);
  }
}

class Equation{
  public void quadraticEq(double a, double b, double c){
    double discrement = b*b-4*a*c;
    if(discrement >= 0){
      double root1 = (-b+Math.sqrt(discrement))/(2*a);
      double root2 = (-b-Math.sqrt(discrement))/(2*a);
      System.out.println("root1 = " + root1);
      System.out.println("root2 = " + root2);
    }
    else{
      System.out.println("[-"+ b + " ± " + (-discrement) + "i ]/"+ (2*a));
    }
    
  }
}
