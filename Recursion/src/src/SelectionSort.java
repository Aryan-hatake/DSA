import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,4,6,8,7};

        System.out.println(Arrays.toString(selectionSort(arr,0,0,Integer.MIN_VALUE,0)));
    }

    static int[] selectionSort(int[] arr,int i,int j,int max,int maxIdx){
        if(i == arr.length - 1) return arr;

            if(max < arr[j]) {
                max = arr[j];
                maxIdx = j;
            };
        if(j< arr.length-i-1){
            return selectionSort(arr,i,j+1,max,maxIdx);
        }
        else{
            swap(maxIdx,j,arr);
            return selectionSort(arr,i+1,0,Integer.MIN_VALUE,0);
        }
    }

    static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
