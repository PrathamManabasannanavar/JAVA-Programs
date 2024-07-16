
public class GenericsArrPrint {
//	T[] t1 = new T[2];
 	static <T> void printArr(T[] arr) {
		for(T ele : arr) {
			System.out.println(ele + " ");
		}
		System.err.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr1[] = {2,3,4,5};
		printArr(arr1);
		
		Float arr2[] = {2.2f,3.1f,4.3f,5.3f};
		printArr(arr2);
		
		Character arr3[] = {'h', 'e', 'l', 'l', 'o'};
		printArr(arr3);
	}

}
