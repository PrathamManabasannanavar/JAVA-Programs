import java.util.*;

public class Collections0 {
    public static void main(String[] args) {
      List<Integer> c1 = new ArrayList<>();
      System.out.println(c1);
      c1.add(3);
      c1.addAll(Arrays.asList(4,5,6));
      c1.remove(1);
      System.out.println(c1.contains(8));
      System.out.println(c1.get(2));
      System.out.println(c1);
      
      Map<Integer, String> mp = new HashMap<>();
      mp.put(5,"hi");
      mp.put(6,"bye");
      mp.put(7, "google");
      mp.put(8,"hi");
      System.out.println(mp);
     // mp.remove(5);
      System.out.println(mp.keySet());
      System.out.println(mp.values());
      System.out.println(mp.get(6));
      System.out.println(mp.entrySet());
  }
}
