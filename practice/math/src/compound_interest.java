import java.util.Scanner;

public class compound_interest{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        int n = sc.nextInt();

        int pow = n*t;
        double expo = 1+r/n;
         
        double base = Math.pow(expo,pow);

        double a = p * base;

        double ci = a-p;
        
        System.out.printf("%.2f",ci);

        
    }
}
    
    