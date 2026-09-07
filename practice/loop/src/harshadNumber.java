
public class harshadNumber {
    public static void main(String[] args) {

        int n = 19;
        int temp = n;
        int sum = 0;

        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            temp/=10;
        }
        System.out.println(n + "%" + sum );
        System.out.println(n%sum);


        }
    }
