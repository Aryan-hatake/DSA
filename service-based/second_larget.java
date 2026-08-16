public class second_larget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        boolean identicalEle = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if((i>0) && (arr[i] != arr[i-1])){
                identicalEle = false;
            }
        }

        System.out.println(max);
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > secondMax && i < max) {
                secondMax = i;
            }
        }

        if(identicalEle){
            System.out.println(-1);
        }
        System.out.println(secondMax);
    }
}
