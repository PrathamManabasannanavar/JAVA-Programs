import java.util.*;

class test<T>{
	T var;
	test(T var){
		this.var = var;
		printObject();
	}
	void printObject() {
		System.out.println(var.getClass());
		System.out.println(var.getClass().getName());
		System.out.println(var);
	}
}
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test<Integer> obj1 = new <Integer> test(12);
		test<String> obj2 = new <String> test("CSE SDMCET");
		test<Double> obj3 = new <Double> test(22.45);
	}

}
