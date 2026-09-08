public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int sum =0;
        int nLen = String.valueOf(n).length();
        while(n>0){
            int digit = n % 10;
            sum += (int) Math.pow(digit,nLen);
            n/=10;

        }

        System.out.println(sum + " "+ n);
    }
}
