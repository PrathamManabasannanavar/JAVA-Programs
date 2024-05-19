//A simple Java program to demonstrate super method in Constructor
class Student
{
	  String name;
	  int rollNo;
	  
	  static //This block is initiated once
	  {
                System.out.println("in Static");
	  }
	  public Student()
	  {
	       System.out.println("in Student constructor");
	  }
}

class College extends Student
{
	int id;
	String dept;
	public College()
	{
	       super(); //no need to write because automatically executed	     
	       System.out.println("in College constructor");		
	}
	
}

public class superAndInheritance {
	public static void main(String[] args) {
		College c = new College();
		c.name = "Rohit";
	        c.id = 23;
	        c.dept = "CSE";
		System.out.println("id = " + c.id + " Name = " + c.name);
	}
}
