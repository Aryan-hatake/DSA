public class ReverseInteger {
    public static void main(String[] args) {
        int x = -34236469;
        boolean isNeg = x < 0 ? true : false ;
        int x2 = Math.abs(x);
        long reverse = 0;
        while(x2>0){
            int last = x2 % 10;
            reverse+=last;
            x2/=10;
            reverse = x2 > 0 ? reverse * 10 : reverse;
        }

        if(reverse > Integer.MAX_VALUE){
            System.out.println(0);
        }

        reverse = isNeg ? -1*reverse : reverse;

        System.out.println(reverse);

    }
}
