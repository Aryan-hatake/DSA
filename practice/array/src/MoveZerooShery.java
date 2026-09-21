import java.util.Arrays;

public class MoveZerooShery {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        int zeroPointer = 0;


        while(zeroPointer < arr.length){
            if(arr[zeroPointer] == 0){
                int nonZeroPointer = nextNonZero(zeroPointer,arr);
                if(nonZeroPointer == -1) break;
                else{
                    swap(zeroPointer,nonZeroPointer,arr);
                }
            }
            zeroPointer++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int nextNonZero(int start,int[] arr){
        int idx = -1;

        for(int i = start;i<arr.length;i++){
            if(arr[i] != 0 ){
                idx = i;
                break;
            }
        }
        return idx;
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

