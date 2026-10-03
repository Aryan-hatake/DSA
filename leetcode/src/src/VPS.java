import java.util.ArrayList;
import java.util.Arrays;

public class VPS {
    public static void main(String[] args) {

        String vps = "()(())()";
        int[] arr = new int[vps.length()];

        for(int i = 0; i<arr.length;i++){
            arr[i] = -1;
        }


        int depth = 0;
        ArrayList<Integer> currOpenBrac = new ArrayList<>();

        for(int i = 0; i<vps.length();i++){
            if(vps.charAt(i) == '('){
                if(depth % 2 == 0) arr[i] = 0;
                else arr[i] = 1;
                depth++;
                currOpenBrac.add(i);

            }
            else{
                int latestBrac = currOpenBrac.get(currOpenBrac.size()-1);
                arr[i] = arr[latestBrac];
                currOpenBrac.remove(currOpenBrac.size()-1);
                depth--;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
