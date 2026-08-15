class largest_ele {
    public static void main(String[] args) {
        
       
        int[] arr ={1,2,3,4,5};
        int max = 0;
        
        int i = 0;
        
        while(i<arr.length){
            
             if(arr[i]>max){
                 max = arr[i];
             }
             
             i++;
        }
        
        System.out.print(max);
        
    }
}
