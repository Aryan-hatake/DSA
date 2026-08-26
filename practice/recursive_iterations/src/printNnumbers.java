public class printNnumbers {
    public static void main(String[] args) {
        int n = 3;
        print(1,n);
    }
    static void print(int i,int n){
        System.out.println(i);
        if (i == n) return;
        i=i+1;
        print(i,n);
    }
}
