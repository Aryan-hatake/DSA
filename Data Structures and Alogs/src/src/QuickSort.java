import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        int s = low;
        int e = high;


        // taking pivot as mid element
        int m = s+(e-s)/2;

        int pivot = arr[m];


        //jabtak s and e pura low se high tak arr traverse na kre tabtak
        while(s<e){
            if(arr[s] == arr[e] && arr[s] == pivot){
                s++;
                e--;
            }

            // agar LHS mein bada element mila toh stop (violation found)
            while(arr[s] < pivot) s++;
            // agar RHS mein chota element mila toh stop (violation found)
            while(arr[e] > pivot) e--;

            //swap those two violation
           if(s<e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

           }
        }

        //do quicksort for all elements for LHS except pivot
        quickSort(arr,low,s-1);

        //except pivot do quicksort for all elements for RHS
        quickSort(arr,e+1,high);
    }
}
