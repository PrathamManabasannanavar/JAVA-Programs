//A simple java pgm to remove the elements of ArrayList using Iterator interface
import java.util.*;

public class  ArrayListTraversalImp {
    public static void main(String[] args) {
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(2);
    a1.add(3);
    Collections.addAll(a1, 4, 5, 6);
    System.out.println(a1);
    // int k = 0;
    // for(Integer e : a1){
    //   // System.out.println(e + " ");
    //   if(e == 3 || e == 2){
    //     a1.remove(k);
    //   }
    //   k++;
    // }
    
    //this doesn't work because for-each loop internally uses Iterator to traverse the elements of the
    //collecton so it assumes that no modification will be done on the ArrayList until the loop terminates
    //so use external iterator
    
    Iterator<Integer> itr = a1.iterator();
    while(itr.hasNext()){
     Integer no = itr.next();
      if( no == 2 || no == 3){
        itr.remove();
      }
    }
      System.out.println(a1);
  }
}
