import java.util.ArrayList;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "racecar";

        int leftPointer = (s.length()-1)/2;
        int rightPointer = (s.length()-1)/2;

        String longestPalindrome = "";
        while(leftPointer >= 0 && rightPointer <= s.length() -1){
            if( leftPointer > 0 && s.charAt(leftPointer+1) == s.charAt(leftPointer-1)){
                   longestPalindrome = searchPalindrome(s,leftPointer-1,leftPointer+1,new int[]{leftPointer-1,leftPointer+1},longestPalindrome);
            }
            if( rightPointer < s.length()-1 && s.charAt(rightPointer+1) == s.charAt(rightPointer-1)){
                longestPalindrome = searchPalindrome(s,rightPointer-1,rightPointer+1,new int[]{rightPointer-1,rightPointer+1},longestPalindrome);
            }

            leftPointer = rightPointer < s.length()-1 && leftPointer == 0 ? 0 : leftPointer-1;
            rightPointer = leftPointer > 0 && rightPointer == s.length() - 1 ? s.length()-1  : rightPointer+1;


        }

        System.out.println(longestPalindrome);



    }

    static String searchPalindrome(String s,int leftPointer,int rightPointer,int[] startEnd,String longestPalindrome){
        if(leftPointer < 0 && rightPointer == s.length()+1) return longestPalindrome;

        if(s.charAt(leftPointer) == s.charAt(rightPointer)){
            if( (rightPointer - leftPointer) + 1 >= longestPalindrome.length() ){
                startEnd[0] = leftPointer;
                startEnd[1] = rightPointer;
            }

            if(leftPointer == 0 && rightPointer <= s.length()-1){
               return  searchPalindrome(s,0,rightPointer+1,startEnd,longestPalindrome);
            } else if (rightPointer == s.length()-1 && leftPointer > 0) {
                return searchPalindrome(s,leftPointer-1,s.length()-1,startEnd,longestPalindrome);
            }
            else {
                return searchPalindrome(s,leftPointer-1,rightPointer+1,startEnd,longestPalindrome);
            }

        }

        return s.substring(leftPointer,rightPointer);
        }
}
