public class AutoMorphicNum {
    public static void main(String[] args) {
        int n = 5;
        String nLength = Integer.toString(n);

        int sqN = n * n;

        String sqNIterate = Integer.toString(sqN);

        StringBuilder lastSum = new StringBuilder();

        for (int i = (sqNIterate.length() - nLength.length()) ; i<sqNIterate.length();i++){
            char c = sqNIterate.charAt(i);
            lastSum.append(c);
        }

        if(n == Integer.parseInt(lastSum.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
