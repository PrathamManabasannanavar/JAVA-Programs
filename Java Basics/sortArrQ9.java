//A simple java pgm to sort the elemnts in the a Generic a  array

public class SortArrQ9<T extends Comparable<T>>{
	
	void swap(T ele[], int i, int j) {
		T temp = ele[j];
		ele[j] = ele[j+1];
		ele[j+1] = temp;
	}
	public void sortArrGeneric(T ele[]) {
		for(int i=0; i<ele.length-1; i++) {
			for(int j=0; j<ele.length-1-i; j++) {
				if(ele[j].compareTo(ele[j+1]) > 0) {
					swap(ele, i, j); //you can't do swap(a, b) because you are only passing the values not the reference of the array
				}
			}
		}
	}
	
	void display(T arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {4, 2 , 1, 3};
		SortArr<Integer> s1 = new SortArr<Integer>();
		s1.sortArrGeneric(arr);
		s1.display(arr);
	}

}
