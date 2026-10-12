import java.util.ArrayList;

class digitSum {


    public static void main(String[] args) {

        ArrayList<Integer> digitSum = new ArrayList<>();
        int k = 3;
        String s = "61515";
        int limit = 1;
        int currentSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (limit <= 3) {
                currentSum += s.charAt(i) - '0';
                limit++;
            } else {
                digitSum.add(currentSum  );
                limit = 1;
                currentSum = s.charAt(i) - '0' ;
            }
            if(i == s.length() -1){
                digitSum.add(currentSum);
            }
     
            System.out.println(currentSum + " " + s.charAt(i));
        }
         int totalSum = 0;
        for(int i =0;i<digitSum.size();i++){
           totalSum+=digitSum.get(i);
        }
        System.out.print(digitSum);
        System.out.print(totalSum);
        

    }
}