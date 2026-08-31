import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LexioSmallerArr {
    public static void main(String[] args) {


        int[] arr = {5,100,44,45,16,30,14,65,83,64};

        int limit = 15;

        ArrayList<Integer> group = new ArrayList<>();
        ArrayList<Integer> groupIdx = new ArrayList<>();

        for (int i =0; i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]-arr[j] <=limit && arr[i] - arr[j] > 0 && i!=j){
                    if(!group.contains(arr[i])){
                        group.add(arr[i]);
                        groupIdx.add(i);
                    }
                    if(!group.contains((arr[j]))){
                        group.add(arr[j]);
                        groupIdx.add(j);
                    }
                }
            }
        }

        ArrayList<Integer> sortedGroup = new ArrayList<>(group);
        ArrayList<Integer> sortedGroupIdx = new ArrayList<>(groupIdx);
        Collections.sort(sortedGroup);
        Collections.sort(sortedGroupIdx);

        System.out.println(group);
        System.out.println(sortedGroupIdx);

      for(int i =0; i<sortedGroup.size();i++){
          replace(arr,sortedGroupIdx.get(i), sortedGroup.get(i));
      }

        System.out.println(Arrays.toString(arr));
    }


    static void replace(int[] arr, int idx, int num) {
        arr[idx] = num;
    }
    static int originalIdx(int[] arr, int ele) {
        for (int i =0; i< arr.length;i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
}