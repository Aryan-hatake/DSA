import java.util.Scanner;

public class Discount {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        float discount = 0;

        if(amount >= 0 && amount <=5000 ){
            discount = 0;
        }
        if(amount >= 5001 && amount <=7000 ){
            discount = 5;
        }
        if(amount >= 7001 && amount <=9000 ){
            discount = 10;
        }
        if(amount >9000 ){
            discount = 20;
        }

        float discountAmount = amount *  (discount/100);

        System.out.print((int)(amount - discountAmount));

    }
}
