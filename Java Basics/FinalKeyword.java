//Java Program to demonstrate final keyword 

//final keyword:
//for variables  --> const
//for methods ---> cannot override in subclasses
//for classes --> cannot inherit


class A1 {
	final int a = 5;
	public final void hello() {
		System.out.println("hello");
	}
}

class B1 extends A1{
	//public void hello() {} //throws error}
}

public class FinalKeyword {
	public static void main(String[] args) {
		B1 b = new B1();
		System.out.println(b.a);
		b.hello();
	}
}
