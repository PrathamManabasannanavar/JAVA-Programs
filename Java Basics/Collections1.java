//A simple java program to demonstrate ArrayList class
import java.util.*;

public class Collections1 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      Collection<Student> s = new ArrayList<>();
      for(int i=0; i<3; i++){
        s.add(new Student (i+1, "hello", 5f));
      }
      for(Student student : s){
        student.display();
      }
  }
}

class Student{
  String name;
  int rollno;
  float cgpa;
  
  Student(int rollno, String name, float cgpa){
    this.name = name;
    this.rollno = rollno;
    this.cgpa = cgpa;
  }
  
  void display(){
    System.out.println("roll no: " + rollno);
    System.out.println("name: " + name);
    System.out.println("cgpa: " + cgpa);
    System.out.println();
  }
}
