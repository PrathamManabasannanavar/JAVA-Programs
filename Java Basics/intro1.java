import java.util.*;

class Student
{
  String name;
  int rollNo;
}

class Main
{
  public static void main(String args[])
  {
    Student s1[] = new Student[3];
    
    for(int i=0; i<s1.length; i++)
    {
       s1[i] = new Student();
       s1[i].name = "gio";
       s1[i].rollNo = 69;
    }
    for(Student temp : s1)
    {
        System.out.println( temp.name + " : " + temp.rollNo);
    }
  }
}
