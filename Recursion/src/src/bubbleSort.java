import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        int[] sorted = bubbleSort(arr,0,0,0);

        System.out.println(Arrays.toString(sorted));
    }

    static int[] bubbleSort(int[] arr,int i,int j,int swapped){
        if(arr[j] > arr[j+1]) {
            swapped++;
            swap(arr, j, j + 1);
        };

        if(i == arr.length-1 || (swapped == 0 && j == arr.length - 2)) return arr;

        if(j< arr.length-2){
           return bubbleSort(arr,i,j+1,swapped);
        }
        else{
           return bubbleSort(arr,i+1,0,swapped);
        }
    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
