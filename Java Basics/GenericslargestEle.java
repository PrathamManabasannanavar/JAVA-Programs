
public class GenericslargestEle<T> {
	static <T> void printArr(T[] arr) {
		for(T ele : arr) {
			System.out.println(ele + " ");
		}
		System.out.println();
	}
	
	static <T extends Comparable<T>> T largestEle(T arr[]) { //Comparable is a interface still extends is used
		T largest = arr[0];
		for( T ele : arr) {
			if(ele.compareTo(largest) > 0) {
				largest = ele;
			}			
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr1[] = {2,3,4,5};
		printArr(arr1);
		System.out.println(largestEle(arr1) + " is largest");
		
		Float arr2[] = {2.2f,3.1f,4.3f,5.3f};
		printArr(arr2);
		System.out.println(largestEle(arr2) +  " is largest");
		
		Character arr3[] = {'h', 'e', 'l', 'l', 'o'};
		printArr(arr3);
		System.out.println(largestEle(arr3) +  " is largest");
	}

}
