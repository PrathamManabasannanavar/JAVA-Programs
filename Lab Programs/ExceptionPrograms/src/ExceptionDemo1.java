
class A{
	public void hello() {
		System.out.println("testing Exception");
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		int arr[] = new int[5];
		int a=1, b=2, c=0;
			String str=null;
	
		try {
			arr[5] = 12;
			a = b/c;
		}
	    
		catch(ArithmeticException e){
//			System.out.println("/ by 0");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("/ by 0");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception handled");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Executing finanlly");
    }
	}

}
