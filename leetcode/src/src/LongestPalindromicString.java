import java.util.ArrayList;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "babad";

        ArrayList<String> palindromes = new ArrayList<>();

        palindromes.add(s.charAt(0)+"");

        for(int i = 0 ;i<s.length();i++){

            String currentPalindrome = "" + s.charAt(i);

            for(int j = i+1 ; j<s.length();j++){
                  currentPalindrome += s.charAt(j);

                  boolean checkPalindrome = isPalindrome(currentPalindrome);

                  if(checkPalindrome) palindromes.add(currentPalindrome);
            }

        }

        int longestLength = 0;
        int longestIndex  = 0;

        for(int i = 0; i<palindromes.size();i++){
            if(palindromes.get(i).length() > longestLength ){
                longestLength = palindromes.get(i).length();
                longestIndex = i;
            }
         }
        System.out.println(palindromes);
        System.out.println(palindromes.get(longestIndex));


    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while (left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
