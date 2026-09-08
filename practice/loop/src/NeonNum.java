public class NeonNum {
    public static void main(String[] args) {
        int n = 8;
        double sqr = Math.pow(n,2);

        int sum = 0;


        while(sqr > 0){
            sum += sqr % 10;
            sqr/=10;
        }

        System.out.println(sum);
        if(sum == n){
            System.out.println("Y");

        }
        else{
            System.out.println("N");
        }
    }
}
