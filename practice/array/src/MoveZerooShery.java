import java.util.Arrays;

public class MoveZerooShery {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1};

        int lastZeroIdx = arr.length - 1;

        int i = 0;


        while (i < arr.length) {

            if (arr[i] == 0) {
                swap(i, lastZeroIdx, arr);
                lastZeroIdx--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

