import java.util.Arrays;

public class IntToRoman {
    public static void main(String[] args) {
        int[] romanValues = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romanLetters = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int n = 3999;

        int[] arr = String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .toArray();

        int i = 0;

        String Roman ="";
        while(i<arr.length){
            int currentNum = arr[i] * (int) Math.pow(10,(arr.length-1)-i);
            boolean lessThenThou = true;
            if(currentNum >= 1000){
                Roman += "M".repeat(arr[i]);
                lessThenThou = false;
            }
            int lowest = Integer.MAX_VALUE;
            int prev = Integer.MAX_VALUE;
            int lowestIdx = 0;

            while(currentNum!=0 && lessThenThou){
                for(int r= 0;r < romanLetters.length;r++){
                    int result = Math.abs(currentNum - romanValues[r]);
                    if(prev<result) break;

                    if(lowest > result){
                        lowest = result;
                        lowestIdx = r;
                    }
                    prev = result;
                }
                Roman += romanLetters[lowestIdx];
                currentNum-=romanValues[lowestIdx];
            }
            i++;
        }
        System.out.println(Roman);
    }
}
