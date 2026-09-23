public class MinimumNumberToBalanceArray {
    public static void main(String[] args) {
        int leftSum = 0;
        int rightSum = 0;

        int[] arr = {2,2,4,5,6};

        int mid  = Math.round((arr.length-1)/2);

        for(int i = 0;i<mid;i++){
            leftSum += arr[i];
        }
        for(int i = mid;i<arr.length;i++){
            rightSum += arr[i];



        }

        System.out.println(Math.abs(leftSum - rightSum));
    }
}
