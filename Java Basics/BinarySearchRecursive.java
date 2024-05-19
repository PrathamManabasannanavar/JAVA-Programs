//A simple Java program to perform Binary Search using Recursion
class BinarySearchRecursive{
  public static void main (String[] args) {
    int arr[] = {2,3,5,6,7,8};
    System.out.println(Search.binarySearch(arr, 0, arr.length-1, 4));
  }
}

class Search{
  public static int binarySearch(int arr[], int start, int end, int key){
     int mid = (start+end)/2;
     if(start > end) return -1;
     if(key == arr[mid])
      return mid;
     else if(key < arr[mid])
      return binarySearch(arr, 0, mid-1, key);
     else
      return binarySearch(arr, mid+1, end, key);
  }
}
