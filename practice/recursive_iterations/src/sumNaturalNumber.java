public class sumNaturalNumber {
    public static void main(String[] args) {
        int sum = sumN(1,5,0);
        System.out.print(sum);
    }
    static int sumN(int i,int n,int sum){
        sum = sum + i;
        n--;
        i++;
        if (n == 0) return sum;
        return sumN(i,n,sum);
    }
}
