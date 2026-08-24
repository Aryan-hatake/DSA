public class Leap_Year {
    public static void main (String[] args) {
        int year = 2000;

        if((year % 4 == 0 &&  year % 100 !=0) || year % 400 ==0 ){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Not a Leap Year");
        }


    }
}
