import java.util.Scanner;

public class area_of_circle {
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         
         float rad = sc.nextFloat();

         sc.close();

         double circum = 2 * Math.PI * rad;

         double area = Math.PI * rad * rad;

         System.out.printf("%.2f",circum);
         System.out.println();

         System.out.printf("%.2f",area);
         
     }
}
