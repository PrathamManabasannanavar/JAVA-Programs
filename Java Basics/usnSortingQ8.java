import java.util.*;

class Student implements Comparable<Student>{
	String name;
	String usn;
	Integer marks;
	Float cgpa;
	
	Student(String name, String usn, Integer marks, Float cgpa){
		this.name = name;
		this.usn = usn;
		this.cgpa = cgpa;
		this.marks = marks;
	}
	
	public int compareTo(Student st) {
		return this.usn.compareTo(st.usn);
	}
	
	public void displayStudent() {
		System.out.println("Name :" + name);
		System.out.println("Usn :" + usn);
		System.out.println("marks :" + marks);
		System.out.println("CGPA :" + cgpa);
	}
		
}

public class usnSorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			System.out.println(i + " Enter the student name, usn, marks, cgpa");
			st.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat()));
		}
		for(Student s: st) {
			s.displayStudent();
		}
		Collections.sort(st);
		System.out.println("Students after sorting");
		for(Student s: st) {
			s.displayStudent();
		}
	}

}
