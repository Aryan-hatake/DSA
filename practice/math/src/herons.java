import java.util.Scanner;

public class herons{
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         
         sc.close(); 
         
         float s = (a+b+c)/2;

         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

         System.out.printf("%.2f",area);
         
     }
}