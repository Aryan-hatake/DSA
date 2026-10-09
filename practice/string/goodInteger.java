class goodInteger{
    public static void main(String[] args){
            int countRep = 1;

        ArrayList<Integer> store = new ArrayList<>();
 


        for(int i = 0 ; i<num.length()-1; i++){

               if(num.charAt(i) == num.charAt(i+1)){
                countRep++;        
                };
               if(countRep == 3){
                  store.add(num.charAt(i) - '0');
                  countRep = 1;
               };
               
        }

  
        if(store.size() > 0 ){
            int max = 0;

            for(int i = 0 ;i<store.size();i++){
                if(max < store.get(i)){
                    max = store.get(i);
                }
            }
              System.out.println(String.valueOf(max).repeat(4));
            
        }
          System.out.println("");
    }
}