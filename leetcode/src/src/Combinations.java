import java.util.ArrayList;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k =2;

        ArrayList<ArrayList<Integer>> Combinations = new ArrayList<>();

        for(int i = 1;i<=n;i++){
            for(int j=i;j<=n;j+=k-1){
                  ArrayList<Integer> = getList(i,j);
            }
        }
    }

    static ArrayList<Integer> getList(int i, int j,int k,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> parentList){



    }
}
