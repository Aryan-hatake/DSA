import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {1,4,4,3,8};
        mergeSortInPlace(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int s, int e, int[] arr){
        int m = (s+e)/2;
        if(s == e && e == m) return;

        mergeSortInPlace(s,m,arr);
        mergeSortInPlace(m+1,e,arr);

        int[] sortTemp = Arrays.copyOfRange(arr,s,e+1);

        int i = s;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=e ){
            if(arr[i] < arr[j]){
                sortTemp[k] = arr[i];
                i++;
            }
            else{
                sortTemp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=m){
            sortTemp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=e){
            sortTemp[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(sortTemp, 0, arr, s,sortTemp.length);
    }
}
