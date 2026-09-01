public class Pattern {
    public static void main(String[] args) {
//        pattern1(4,1);
        int n = 4;
        int mid = n/2;
        pattern2(n,mid,mid,1,n-1);
    }

    static void pattern1(int row, int col){
        if(row == 0) return;

        System.out.print("*");

        if(row == col){
            row--;
            System.out.println("");
            pattern1(row,1);
        }else{
            pattern1(row,col+1);
        }
    }

    static void pattern2(int col, int left,int right,int i, int stars){

       if(left == 0 && right == col ) return;
       if(i < left){
           System.out.print(" ");
           pattern2(col,left,right,i+1,stars);
       };

      if(i >= left && i<=right){
          System.out.print("*");
          pattern2(col,left,right,i+1,stars);
      }
      if(i > right && i <col ){
          System.out.print(" ");
          pattern2(col,left,right,i+1,stars);
      }

      if(col == i){
          if(col - stars < col) {
              System.out.print(" ");
              System.out.println();
              pattern2(col,left-1,right+1,1,stars-1);
          }
          else{
              System.out.print("*");
              return;
          }
      }

    }
}
