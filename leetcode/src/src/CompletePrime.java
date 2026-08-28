import java.util.Arrays;

public class CompletePrime {
    public static void main(String[] args) {
        int num = 31373;
        int[] arr = splitNum(num);



        boolean prefixConculsion = checkPrefix(arr);
        boolean suffixConculsion = checkSuffix(arr);


        System.out.println(suffixConculsion && prefixConculsion);

    }

    static int[] splitNum(int num){
        String s = String.valueOf(num);
        int [] arr = new int[s.length()];

        for (int i = 0; i<s.length() ; i++){
            char c  = s.charAt(i);
            arr[i] = c - '0';
        }

        return arr;
    }

    static boolean checkPrefix(int[] arr){
        int prefix = 0;
        boolean isPrime = true;

        for (int i = 0 ; i <arr.length ; i++){

            prefix+= arr[i];
            boolean nIsPrime = checkPrime(prefix);
            isPrime = nIsPrime && isPrime;
            if(i < arr.length-1){
                prefix*=10;
            }
            if(!isPrime) break;
        }

        return isPrime;
    }
    static boolean checkSuffix(int[] arr){

        boolean isPrime = true;

        int[] suffixArr = new int[arr.length];

        for (int i = arr.length-1 ; i >=0 ; i--){

            suffixArr[i] = arr[i];

            int suffix = mergeArray(suffixArr);

            boolean nisPrime = checkPrime(suffix);

            isPrime = nisPrime && isPrime;

            if(!isPrime) break;
        }

        return isPrime;
    }
    static  int mergeArray(int[] arr){
        int n = 0;
        for (int digit : arr) {
             n = n * 10 + digit;
        }
        return n;
    }

    static boolean checkPrime(int n){
        if(n < 1 || n==1) return false;
        boolean isPrime = true;

        for(int i = 2; i<=Math.sqrt(n) ; i++){
            if(n % i == 0 && n != i) isPrime = false;
        }

        return isPrime ;
    }
}
