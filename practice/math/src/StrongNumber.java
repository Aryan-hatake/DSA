public class StrongNumber{
    public static void main(String[] args){
        int input = 145;
        int temp = input;
        int sum = 0;
        while(input > 0){
            int last = input % 10;
            int facto = getFactorial(last);
            sum+=facto;
            input/=10;
        }
       if(sum == temp){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
    static int getFactorial(int n){
        if(n == 1) return 1;
        return n * getFactorial(n-1);
    }
}