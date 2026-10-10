class highestInt{
    public static void main(String[] args){
         ArrayList<Integer> nums = new ArrayList<>();


      

       
       for(int i =0;i<number.length();i++){
           if(number.charAt(i) == digit){
                int result = Integer.parseInt(number.substring(0,i) + number.substring(i+1) );
                nums.add(result);
           }
       }
       
       int max = 0;
       for(int i = 0;i<nums.size();i++){
           if(max<nums.get(i)){
            max = nums.get(i);
           }
       }
      System.out.print(max);
    }
}