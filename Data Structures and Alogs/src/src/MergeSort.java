import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1,4,4,3,2,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){

        if(arr.length ==1 ) return arr;

        int mid = arr.length/2;

        int[] arr1 =   mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] arr2 =   mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        int[] arr3 = new int[arr1.length+arr2.length];

        int i =0;
        int j =0;
        int k =0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j< arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }



}