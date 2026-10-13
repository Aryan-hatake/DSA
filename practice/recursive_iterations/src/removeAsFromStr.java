class removeAsFromStr{
    public static void main(String[] args){
        // String s = "Aryan";
//        System.out.print(AntiAPortal(s,0,""));

        String[] sArr = {"I","Love","you","you" ,"love"," who?"};
        System.out.print(AntiStrPortal(sArr,"you"));
    }

    // static String AntiAPortal(String oldString,int idx,String newString){

    //     if(Character.toLowerCase(oldString.charAt(idx)) != 'a'){
    //         newString += oldString.charAt(idx);
    //     }

    //     if(idx == oldString.length() -1){
    //           return newString;
    //     }
    //     return AntiAPortal(oldString,idx+1,newString);

    // }
    static String AntiStrPortal(String[] StrArr,String targetStr){

        if(StrArr.length == 0){
              return "";
        }
        String str =  StrArr[0];

        String[] newArray = new String[StrArr.length - 1];
        System.arraycopy(StrArr, 1, newArray, 0 , newArray.length);

        if(str != targetStr ){
            return str + AntiStrPortal(newArray,targetStr);
        }
        else{
            return AntiStrPortal(newArray,targetStr);
        }

    

    }
}