
public class GenericFunction {
	static<T> void print(T e) {
		System.out.println(e.getClass() + ":" + e);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		print("hello");
		print(23);
		print(4.5);
	}

}
 