public class Vshape {
    public static void main(String[] args) {

        int n = 6;
        int left = 1;
        int right = (n*2)-1;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=(n*2)-1;j++){
                if(j == left || j == right){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
            left++;
            right--;
        }
    }
}
