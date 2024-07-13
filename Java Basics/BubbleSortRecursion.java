//A simple java program to perform bubble sort using Recusion
public class BubbleSortRecursion {

    static public void sortArr(int arr[], int start, int end){
        if(end < 0){
            return;
        }

        while(start != end){
            if(arr[start] > arr[start+1]){
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            start++;
        }
        sortArr(arr, 0, end-1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = 5;
        sortArr(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
