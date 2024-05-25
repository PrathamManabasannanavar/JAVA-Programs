import java.util.*;

class Student1 implements Comparable<Student1>{
    String usn;
    String name;
    Integer marks;

    public Student1(String usn, String name, Integer marks) {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student1 obj) {
        return this.usn.compareTo(obj.usn);
    }
}

class IA2CollectionsSort {
    public static void main(String args[]) {
        ArrayList<Student1> a1 = new ArrayList<>();
        a1.add(new Student1("2SD22CS053", "GOOGLE", 8));
        a1.add(new Student1("2SD22CS036", "ios", 8));
        a1.add(new Student1("2SD22CS049", "ra", 8));
        Collections.sort(a1);
        for(Student1 s1 : a1){
            System.out.println(s1.usn);
        }
    }
}