public class Vowel_or_Consonant {
    public static void main(String[] args) {
        char ch = 'a';
        String ans =  !((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) ? "Invalid input" : switch(Character.toLowerCase(ch)){
            case 'a','e','i','o','u' -> "Vowel";
            default -> "Consonant";
        };
        System.out.println(ans);
    }
}
