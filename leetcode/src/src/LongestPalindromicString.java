public class LongestPalindromicString {

    public static void main(String[] args) {

        String s = "aaabaaaa";

        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome
            String odd = expandFromCenter(s, i, i);

            // Even-length palindrome
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > longestPalindrome.length()) {
                longestPalindrome = odd;
            }

            if (even.length() > longestPalindrome.length()) {
                longestPalindrome = even;
            }
        }

        System.out.println(longestPalindrome);
    }

    static String expandFromCenter(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}