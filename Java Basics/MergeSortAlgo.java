//A simple Java program to implement Merge sort algorithm
class Sort{
	public static void merge(int arr[], int start, int mid, int end) {
		int i = start, j = mid+1, k=0;
		int result[] = new int[end-start+1];
		while(i <= mid && j <= end)
		{
			if(arr[i] < arr[j])
		            result[k++] = arr[i++];
			else
			    result[k++] = arr[j++];	
		}
		while(i <= mid)
		    result[k++] = arr[i++];
		while(j <= end)
		    result[k++] = arr[j++];
		for(int itr=0; itr<end-start+1; itr++)
		   arr[itr+start] = result[itr];
	}
	public static void mergeSort(int arr[], int start, int end){
		if(start >= end) return;
		int mid = (start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		merge(arr, start, mid,  end);
	}
}

public class MergeSortAlgo {
	public static void main(String[] args) {
		int arr[] = {5,2,7,1,3};
		Sort.mergeSort(arr, 0, 4);
		System.out.println("Sorted array is:");
		for(int ele: arr){
			System.out.print(ele + " ");
		}
	}
}
