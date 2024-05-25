import java.util.*;

class Student implements Comparable<Student>{
    String usn;
    String name;
    Integer marks;

    public Student(String usn, String name, Integer marks) {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student obj) {
        return this.usn.compareTo(obj.usn);
    }
}

class IA2GenericsSort {
    public static void main(String args[]) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student("2SD22CS053", "GOOGLE", 8));
        a1.add(new Student("2SD22CS036", "ios", 8));
        a1.add(new Student("2SD22CS049", "ra", 8));
        Collections.sort(a1);
        for(Student s1 : a1){
            System.out.println(s1.usn);
        }
    }
}