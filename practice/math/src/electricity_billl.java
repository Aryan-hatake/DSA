import  java.util.Scanner;

public class electricity_billl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float unit  = sc.nextInt();

        float unitPrice = 0;

        if(unit >=0 && unit <= 100){
            unitPrice = 4.2f;
        }
        if(unit >=101 && unit <= 200){
            unitPrice = 6f;
        }
        if(unit >=201 && unit <= 400){
            unitPrice = 8f;
        }
        if(unit >400){
            unitPrice = 13f;
        }

        float finalPrice = unit * unitPrice;

        System.out.println(Math.round(finalPrice * 10)/10.0f);
    }
}
