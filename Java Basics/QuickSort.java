class QuickSort{
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        // code here
       if(low >= high) return;
       int mid = partition(arr, low, high);
       quickSort(arr, low, mid-1);
       quickSort(arr, mid+1, high);
    }
    int partition (int arr[], int low, int high)
    {
       // Your code here
         int pivot = low;
         while(low <= high){
            while(low <= high && arr[low] <= arr[pivot])
               low++;
            while(low <= high && arr[high] >= arr[pivot])
               high--;
            if(low < high) {
                swap(arr[low], arr[high]);
            }  
        }
        swap(arr[pivot], arr[high]);
        return high;
    }
}