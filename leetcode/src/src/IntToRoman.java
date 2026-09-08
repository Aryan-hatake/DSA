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
        int currentNum = arr[i] * (int) Math.pow(10,(arr.length-1)-i);
        String Roman ="";

        while (i< arr.length){


            if(currentNum == 0 && i < arr.length-1){
                i++;
                currentNum = arr[i] * (int) Math.pow(10,(arr.length-1)-i);
            }
            else if(currentNum >=1 && currentNum<4){
                Roman+=romanLetters[0];
                currentNum-=romanValues[0];
            }
            else  if(currentNum == 4){
                Roman+=romanLetters[1];
                currentNum-=romanValues[1];
            }  else  if(currentNum >=5 && currentNum<9) {
                Roman += romanLetters[2];
                currentNum -= romanValues[2];
            }
                else if(currentNum == 9){
                    Roman+=romanLetters[3];
                    currentNum-=romanValues[3];
                }
             else  if(currentNum >=10 && currentNum<40){
                Roman+=romanLetters[4];
                currentNum-=romanValues[4];
            } else  if(currentNum >=40 && currentNum<50){
                Roman+=romanLetters[5];
                currentNum-=romanValues[5];
            } else  if(currentNum >=50 && currentNum<90){
                Roman+=romanLetters[6];
                currentNum-=romanValues[6];
            } else  if(currentNum >=90 && currentNum<100){
                Roman+=romanLetters[7];
                currentNum-=romanValues[7];
            }else  if(currentNum >=100 && currentNum<400){
                Roman+=romanLetters[8];
                currentNum-=romanValues[8];
            }else  if(currentNum >=400 && currentNum<500){
                Roman+=romanLetters[9];
                currentNum-=romanValues[9];
            }else  if(currentNum >=500 && currentNum<900){
                Roman+=romanLetters[10];
                currentNum-=romanValues[10];
            }else  if(currentNum >=900 && currentNum<1000){
                Roman+=romanLetters[11];
                currentNum-=romanValues[11];
            }
            else if( currentNum >=1000){
                Roman += "M";
                currentNum-=romanValues[12];
            }
            else{
                i++;
            }

        }
//        while(i<arr.length){
//            int currentNum = arr[i] * (int) Math.pow(10,(arr.length-1)-i);
//            boolean lessThenThou = true;
//            if(currentNum >= 1000){
//                Roman += "M".repeat(arr[i]);
//                lessThenThou = false;
//            }
//            int lowest = Integer.MAX_VALUE;
//            int prev = Integer.MAX_VALUE;
//            int lowestIdx = 0;
//
//            while(currentNum!=0 && lessThenThou){
//                for(int r= 0;r < romanLetters.length;r++){
//                    int result = Math.abs(currentNum - romanValues[r]);
//                    if(prev<result) break;
//
//                    if(lowest > result){
//                        lowest = result;
//                        lowestIdx = r;
//                    }
//                    prev = result;
//                }
//                Roman += romanLetters[lowestIdx];
//                currentNum-=romanValues[lowestIdx];
//            }
//            i++;
//        }
        System.out.println(Roman);
    }
}
