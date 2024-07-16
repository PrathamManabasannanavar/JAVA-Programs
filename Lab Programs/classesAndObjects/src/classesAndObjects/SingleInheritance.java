package classesAndObjects;

class OperatingSystem{
	public void display() {
		System.out.println("In Operating System");
	}
}

class Ios extends OperatingSystem{
	public void display() {
		System.out.println("in Ios");
	}
}

class Android extends OperatingSystem{
	public void display() {
		System.out.println("in android");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem o1 = new OperatingSystem();
		OperatingSystem o2 = new Android();
		o1.display();
		Android a1 = new Android();
		a1.display();
		Ios i1 = new Ios();
		i1.display();
		o2.display();
	}

}
