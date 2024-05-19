//A simple Java program to print tge tables in a synchronised way
import java.util.Scanner;

public class ThreadsDemo1 {
    public static void main(String[] args) {
      Thread t1 = new TableDisplay(4);
      Thread t2 = new TableDisplay(5);
      Thread t3 = new TableDisplay(6);
      try{
       t1.start();
       t1.join();
       t2.start();
       t2.join();
       t3.start();
       t3.join();
      }
      catch(InterruptedException e){}
    }
}

class TableDisplay extends Thread {
    int n;
  TableDisplay(int n){
      this.n = n;
  }
  public void run(){
    Scanner sc = new Scanner(System.in);
    printTable(n);
  }
  public static void printTable(int n){
    for(int i=1; i<=100; i++){
      System.out.println(" " + n + " * " + i + " = " + n*i);
    }
  }
}
