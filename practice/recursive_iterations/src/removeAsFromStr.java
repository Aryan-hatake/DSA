class removeAsFromStr{
    public static void main(String[] args){
        String s = "Aryan";
        System.out.print(AntiAPortal(s,0,""));
    }

    static String AntiAPortal(String oldString,int idx,String newString){

        if(Character.toLowerCase(oldString.charAt(idx)) != 'a'){
            newString += oldString.charAt(idx);
        }

        if(idx == oldString.length() -1){
              return newString;
        }
        return AntiAPortal(oldString,idx+1,newString);

    }
}