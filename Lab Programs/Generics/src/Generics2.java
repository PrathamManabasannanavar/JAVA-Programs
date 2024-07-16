
class Test1<T, U>{
	T v1;
	U v2;
	
	Test1(T v1, U v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	void print() {
		System.out.println(v1.getClass());
		System.out.println(v2.getClass());
		System.out.println(v1 + " and " + v2);
	}
}
public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1<Integer, String> o1 = new Test1<Integer, String>(20, "CSE");
		o1.print();
	}

}
