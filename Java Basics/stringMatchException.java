//A simple java pgm to check whether the String is Palindrome or not
import java.util.*;

public class stringMatchException {
    public static void main(String[] args) {
    String str = "hellehi";
    String rev = new StringBuilder(str).reverse().toString();
    if(str.equals(rev)){
      System.out.println("String is Palindrome");
      return;
    }
    try{
      throw new NotPalindromeException();
    }catch(Exception e){
      System.out.print(e);
    }
    
  }
}
class NotPalindromeException extends Exception{
  public String toString(){
    return "not a Palindrome Exception";
  }
}
