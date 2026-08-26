public class sumEven_Odd {
    public static void main(String[] args) {

        int start = 1;
        int end = 5;

        int sumEven = sumEvenOdd(start,end,true,0);
        int oddEven = sumEvenOdd(start,end,false,0);

        System.out.println(sumEven);
        System.out.println(oddEven);
    }
    static int sumEvenOdd(int s, int e, boolean isEvenSum,int sum){
        if(isEvenSum){
            sum = s % 2 == 0 ? sum + s : sum;
        }
        else{
            sum = s % 2 != 0 ? sum + s : sum;
        }

        return s == e ? sum : sumEvenOdd(s+1, e, isEvenSum, sum) ;
    }
}
