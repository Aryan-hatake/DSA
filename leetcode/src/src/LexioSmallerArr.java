import java.util.ArrayList;
import java.util.Arrays;

public class LexioSmallerArr {
    public static void main(String[] args) {


        int[] arr = {5,100,44,45,16,30,14,65,83,64};

        int limit = 15;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (((arr[i] > arr[j] && i<j) || (arr[i] - arr[j] < 0 && i - j > 0  )) &&  arr[i] - arr[j] <= limit   ) {
                    swap(arr, i, j);

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}