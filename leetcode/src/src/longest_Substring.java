import java.util.ArrayList;

public class longest_Substring {
    public static void main(String[] args) {

        String s = "baaabca";

        int[] lastIndex = new int[128];

        int max = 0;

        int left = 0;
        int right = 0;
        boolean isFirstIndex = true;
        while(right<s.length()){

            char c = s.charAt(right);
            int cIdx = s.indexOf(c);
             int currentLastIndex = lastIndex[c];

             if(currentLastIndex != right && cIdx != right && currentLastIndex>=left){
                left = currentLastIndex+1;
            }
            lastIndex[c] = right;
            int  currentWindow = (right - left) + 1;
            max = Math.max(max, currentWindow);
            right ++;
        }


        System.out.println(max);
        }


    }
