public class String2Int {
    public static void main(String[] args) {
       String s = "0 123";

       int integer = myAtoi(s);
        System.out.println(integer);

    }

    static int myAtoi(String s){


        int sign = 1;
        long  integer = 0L;
        boolean signChecked = false;
        boolean digitChecked = false;
        boolean minOverflow = false;
        boolean maxOverflow = false;
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            boolean breakLoop = false;


            if(c == '+' || c == '-'){
                boolean isNextValid = true;
                boolean validPrev = true;

                if(i<s.length()-2){
                    char nextCharM = s.charAt(i+1);
                    isNextValid = Character.isDigit(nextCharM);
                }

               if(i>0) {
                   char prevChar = s.charAt(i-1);
                   validPrev = prevChar != ' ' ? false : true;
               }


               if(isNextValid && validPrev){
                   sign = c == '+' ? sign : -1;
                   signChecked = true;
               }
               else{
                   breakLoop = true;
               }

            }

            else if(c == ' ' || c == '0' ){
                if(integer > 0 &&  c == '0'){
                    int toInt = c - '0';
                    integer*=10;
                    integer+= toInt;
                }
                if(c == '0') digitChecked = true;
                if(signChecked && c == ' ') breakLoop = true;
                if(digitChecked && c == ' ') breakLoop = true;
            }

            else{
                if(!Character.isDigit(c)){
                    breakLoop = true;
                }
                else{
                    int toInt = c - '0';
                    integer*=10;
                    integer+= toInt;
                    digitChecked = true;
                }
            }
            if(breakLoop) break;
        long finalInt = integer * sign;

        if(finalInt<Integer.MIN_VALUE){
            minOverflow = true;
            break;
        };
        if(finalInt>Integer.MAX_VALUE){
            maxOverflow = true;
            break;
        };
        }

        if(minOverflow) return -2147483648;
        if(maxOverflow) return 2147483647;
        int finalInt = (int)(integer * sign);

        return finalInt;

    }

}
