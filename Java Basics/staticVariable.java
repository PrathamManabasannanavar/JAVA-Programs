//A simple Java program to Demonstrate Static variable and Constructor

import java.util.*;

//1st ---> class load
//2nd Object Instantation (creation of object)
class Student
{
  String name;
  static int rollNo;

  void setValue (String Name, int roll)
  {
	name = Name;
	rollNo = roll;
  }
  static
  {
	rollNo = 24;
	System.out.println ("In Static");
  }
  void display ()
  {
	System.out.println ("Name " + name + " Roll " + rollNo);
  }
  Student ()
  {
	name = "harsh";
	//rollNo = 69;
  }
}

public class Main
{
  public static void main (String[]args)
  {
	System.out.println ("hi");
	//Student s = new Student()
	//s.display();
	Student s1[] = new Student[2];
	  s1[0] = new Student ();
	  s1[1] = new Student ();
	  s1[0].display ();
	  s1[1].display ();
  }
}
