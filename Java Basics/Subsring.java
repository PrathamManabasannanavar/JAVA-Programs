import java.util.*;

public class Subsring {
    public static boolean matchSubString(String str, String substring){
         boolean flag = true;
         for(int i=0; i<=str.length() - substring.length(); i++){
           flag = true;
           for(int j=0; j<substring.length(); j++){
             if(str.charAt(j+i) != substring.charAt(j)){
               flag = false; break;
             }
           }
           if(flag) return true;
         }
         return false;
    }
    public static void main(String[] args) {
      System.out.println(matchSubString("Oppoisthebestmodel", "thebest"));
  }
}