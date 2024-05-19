//A simple Java program to perform multiplication of 2 matrices usong Threads
import java.util.*;

class Multiply extends Thread{
  int i, j, n;
  static int arr[][], arr1[][], arr2[][];
  static Object lock = new Object();
  
  
  void setArr(int arr[][], int arr1[][], int arr2[][]){
  this.arr = arr;
  this.arr1 = arr1;
  this.arr2 = arr2;
}
  Multiply(int i, int j, int n, int arr1[][], int arr2[][], int arr[][]){
    this.i = i;
    this.j = j;
    this.n = n;
    setArr(arr, arr1, arr2);
    start();
  }
  public void run(){
    synchronized(lock){
       for(int k=0; k<n; k++){
          arr[i][j] += arr1[i][k] * arr2[k][j];
       }
    }
  }
}
/*
33 39 45 
72 87 102 
124 151 178
*/
class MultiplyMatricesThread{
    public static void main(String[] args) {
      int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {8, 9, 10}};
      int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {8, 9, 10}};
      int arr[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
           try{new Multiply(i, j, 3, arr1, arr2, arr).join();}
           catch(Exception e){}
        }
      }
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
           System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
      
  }
}
