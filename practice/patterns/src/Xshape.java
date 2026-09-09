public class Xshape {
    public static void main(String[] args) {
        int n = 7;
        int left = 1;
        int right = n;


        int i =1;
        while(left <= n && right >= 1){
            if(i == left || i == right){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

           if(i == n){
               left++;
               right--;
               i = 0;
               System.out.println();
           }
            i++;
        }
    }
}
