public class printAllFactors {
    public static void main(String[] args) {
        factors(6,1);
    }

    static void factors(int n,int i){

        if(n % i == 0) System.out.println(i);
        i++;
        if(n == i-1) return;
        factors(n,i);
    }
}
