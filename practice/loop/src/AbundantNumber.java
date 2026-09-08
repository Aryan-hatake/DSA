public class AbundantNumber {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;
        System.out.println(Math.sqrt(num));
        for(int i = 1;i<num;i++){
            if(num % i == 0) sum+=i;
        }

        System.out.println(sum);
    }
}
