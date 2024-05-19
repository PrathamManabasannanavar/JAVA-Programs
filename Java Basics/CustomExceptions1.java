//A simple Java program to demonstrate the Custom Exceptions in Java

public class CustomExceptions1 {
    public static void main(String[] args) {
      int n = 1000;
      try{
          throw new ErrorMessage(n);
      }
      catch(ErrorMessage em){
        System.out.println(em);
      }
  }
}

class ErrorMessage extends Exception {
    int n;
    ErrorMessage(int n){
      this.n = n;
    }
    public String toString(){
      if(n < 500){
        return "too less temperature";
      }
      else if(n >= 500){
        return "too high temperature";
      }
      else{
        return "Normal temperature";
      }
      
    }
}
